package com.uco.banco.dominio;

import java.util.List;

public class Banco {
    private String nombre;
    private List<Persona> cilentes;

    public String getNombre() {
        return nombre;
    }

    public List<Persona> getCilentes() {
        return cilentes;
    }


}

