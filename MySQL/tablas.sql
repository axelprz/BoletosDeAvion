CREATE DATABASE boletos_avion;
USE boletos_avion;

CREATE TABLE tipo_documentos (
    id_tipo_documento INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(50) NOT NULL
);

CREATE TABLE nacionalidades (
    id_nacionalidad INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE origen_destinos (
    id_origen_destino INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    nombre_usuario VARCHAR(100)  UNIQUE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    contrasena VARCHAR(255) NOT NULL,
    telefono VARCHAR(20)
);

CREATE TABLE pasajeros (
    id_pasajero INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    id_tipo_documento INT NOT NULL,
    numero_documento VARCHAR(50) NOT NULL,
    id_nacionalidad INT,
    fecha_nacimiento DATE,
    FOREIGN KEY (id_tipo_documento) REFERENCES tipo_documentos(id_tipo_documento),
    FOREIGN KEY (id_nacionalidad) REFERENCES nacionalidades(id_nacionalidad)
);

CREATE TABLE vuelos (
    id_vuelo INT AUTO_INCREMENT PRIMARY KEY,
    numero_vuelo VARCHAR(50) UNIQUE NOT NULL,
    id_origen INT NOT NULL,
    id_destino INT NOT NULL,
    duracion INT,
    precio DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (id_origen) REFERENCES origen_destinos(id_origen_destino),
    FOREIGN KEY (id_destino) REFERENCES origen_destinos(id_origen_destino)
);

CREATE TABLE horario_vuelos (
    id_horario INT AUTO_INCREMENT PRIMARY KEY,
    dia ENUM('lunes', 'martes', 'miércoles', 'jueves', 'viernes', 'sábado', 'domingo') NOT NULL,
    hora TIME NOT NULL,
    id_vuelo INT NOT NULL,
    FOREIGN KEY (id_vuelo) REFERENCES vuelos(id_vuelo)
);

CREATE TABLE estados(
	id_estado INT AUTO_INCREMENT PRIMARY KEY,
    estado ENUM('pendiente','completado','cancelado') NOT NULL
);

CREATE TABLE reservas (
    id_reserva INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_vuelo INT NOT NULL,
    fecha_reserva DATETIME DEFAULT CURRENT_TIMESTAMP,
    id_estado INT DEFAULT 'pendiente',
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_vuelo) REFERENCES vuelos(id_vuelo),
    FOREIGN KEY (id_estado) REFERENCES estados(id_estado)
);

CREATE TABLE metodo_pagos(
	id_metodo_pago INT AUTO_INCREMENT PRIMARY KEY,
    metodo_pago ENUM('Tarjeta de crédito','Tarjeta de débito','PayPal','Transferencia bancaria','Depósito en efectivo') NOT NULL
);

CREATE TABLE pagos (
    id_pago INT AUTO_INCREMENT PRIMARY KEY,
    id_reserva INT NOT NULL,
    id_metodo_pago INT NOT NULL,
    monto DECIMAL(10, 2) NOT NULL,
    fecha_pago DATETIME DEFAULT CURRENT_TIMESTAMP,
    id_estado INT DEFAULT 'completado',
    FOREIGN KEY (id_reserva) REFERENCES reservas(id_reserva),
    FOREIGN KEY (id_metodo_pago) REFERENCES metodo_pagos(id_metodo_pago),
    FOREIGN KEY (id_estado) REFERENCES estados(id_estado)
);

CREATE TABLE reserva_pasajeros (
    id_reserva INT NOT NULL,
    id_pasajero INT NOT NULL,
    PRIMARY KEY (id_reserva, id_pasajero),
    FOREIGN KEY (id_reserva) REFERENCES reservas(id_reserva),
    FOREIGN KEY (id_pasajero) REFERENCES pasajeros(id_pasajero)
);