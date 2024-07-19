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

CREATE TABLE origen_vuelos(
	id_origen INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE destino_vuelos (
    id_destino INT AUTO_INCREMENT PRIMARY KEY,
    lugar VARCHAR(100) NOT NULL UNIQUE,
    id_pais INT NOT NULL,
    imagen LONGBLOB,
    FOREIGN KEY(id_pais) REFERENCES nacionalidades(id_nacionalidad)
);

CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    nombre_usuario VARCHAR(100)  UNIQUE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    contrasena VARCHAR(255) NOT NULL,
    telefono VARCHAR(20),
    imagen LONGBLOB
);

CREATE TABLE dias(
	id_dia INT AUTO_INCREMENT PRIMARY KEY,
    dia VARCHAR(15)
);

CREATE TABLE horario_vuelos (
    id_horario INT AUTO_INCREMENT PRIMARY KEY,
    id_dia INT NOT NULL,
    hora INT NOT NULL,
    FOREIGN KEY(id_dia) REFERENCES dias(id_dia)
);

CREATE TABLE vuelos (
    id_vuelo INT AUTO_INCREMENT PRIMARY KEY,
    numero_vuelo VARCHAR(50) UNIQUE NOT NULL,
    id_origen INT NOT NULL,
    id_destino INT NOT NULL,
    duracion INT NOT NULL,
    precio INT NOT NULL,
    id_horario INT NOT NULL,
    FOREIGN KEY (id_origen) REFERENCES origen_vuelos(id_origen),
    FOREIGN KEY (id_destino) REFERENCES destino_vuelos(id_destino),
    FOREIGN KEY(id_horario) REFERENCES horario_vuelos(id_horario)
);

CREATE TABLE clases (
	id_clase INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    precio INT NOT NULL
);

CREATE TABLE asientos (
	id_asiento INT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(10) NOT NULL,
    id_clase INT NOT NULL,
    FOREIGN KEY(id_clase) REFERENCES clases(id_clase)
);

CREATE TABLE estados(
	id_estado INT AUTO_INCREMENT PRIMARY KEY,
    estado VARCHAR(10) NOT NULL
);

CREATE TABLE reservas (
    id_reserva INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_vuelo INT NOT NULL,
    fecha_reserva VARCHAR(30),
    id_estado INT NOT NULL DEFAULT 1,
    total_pagar INT NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario),
    FOREIGN KEY (id_vuelo) REFERENCES vuelos(id_vuelo),
    FOREIGN KEY (id_estado) REFERENCES estados(id_estado)
);

CREATE TABLE pasajeros (
    id_pasajero INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    id_tipo_documento INT NOT NULL,
    numero_documento VARCHAR(50) NOT NULL,
    id_nacionalidad INT,
    fecha_nacimiento VARCHAR(30),
    id_asiento INT NOT NULL,
    id_reserva INT NOT NULL,
    FOREIGN KEY (id_tipo_documento) REFERENCES tipo_documentos(id_tipo_documento),
    FOREIGN KEY (id_nacionalidad) REFERENCES nacionalidades(id_nacionalidad),
    FOREIGN KEY (id_reserva) REFERENCES reservas(id_reserva)
);

CREATE TABLE metodo_pagos(
	id_metodo_pago INT AUTO_INCREMENT PRIMARY KEY,
    metodo_pago VARCHAR(30) NOT NULL
);

CREATE TABLE pagos (
    id_pago INT AUTO_INCREMENT PRIMARY KEY,
    id_reserva INT NOT NULL,
    id_metodo_pago INT NOT NULL,
    monto INT NOT NULL,
    FOREIGN KEY (id_reserva) REFERENCES reservas(id_reserva),
    FOREIGN KEY (id_metodo_pago) REFERENCES metodo_pagos(id_metodo_pago)
);