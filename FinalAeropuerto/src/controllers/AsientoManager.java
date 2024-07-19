
package controllers;

import java.util.HashSet;
import java.util.Set;

public class AsientoManager {
    private static AsientoManager instance;
    private Set<Integer> asientosSeleccionados;
    private Set<Integer> asientosOcupados;

    private AsientoManager() {
        asientosSeleccionados = new HashSet<>();
        asientosOcupados = new HashSet<>();
    }

    public static AsientoManager getInstance() {
        if (instance == null) {
            instance = new AsientoManager();
        }
        return instance;
    }

    public void seleccionarAsiento(int asiento) {
        asientosSeleccionados.add(asiento);
    }

    public void deseleccionarAsiento(int asiento) {
        asientosSeleccionados.remove(asiento);
    }

    public boolean isAsientoSeleccionado(int asiento) {
        return asientosSeleccionados.contains(asiento);
    }

    public void ocuparAsiento(int asiento) {
        asientosOcupados.add(asiento);
    }

    public boolean isAsientoOcupado(int asiento) {
        return asientosOcupados.contains(asiento);
    }

    public Set<Integer> getAsientosSeleccionados() {
        return new HashSet<>(asientosSeleccionados);
    }

    public Set<Integer> getAsientosOcupados() {
        return new HashSet<>(asientosOcupados);
    }
    
    public void setAsientosOcupados(Set<Integer> asientosOcupados) {
        this.asientosOcupados = new HashSet<>(asientosOcupados);
    }
}

