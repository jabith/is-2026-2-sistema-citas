package com.citas;

import java.util.List;

public class BuscadorCitas {

    public static List<Cita> filtrar(List<Cita> citas, String esp) {
        return citas.stream()
                .filter(c -> c.especialidad().equalsIgnoreCase(esp))
                .toList();
    }
}
