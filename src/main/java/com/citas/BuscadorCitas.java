package com.citas;

import java.util.List;
import java.util.Objects;

public class BuscadorCitas {

    public static List<Cita> filtrarPorEspecialidad(List<Cita> citas, String especialidad) {
        Objects.requireNonNull(citas, "La lista de citas no puede ser null");
        Objects.requireNonNull(especialidad, "La especialidad no puede ser null");
        return citas.stream()
                .filter(c -> c.especialidad().equalsIgnoreCase(especialidad))
                .toList();
    }
}
