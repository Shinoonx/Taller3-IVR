package org.example;

class Evento {
    private String nombre;

    public Evento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void unirseA(Evento evento) {
        System.out.println("El evento " + nombre + " se ha unido al evento " + evento.getNombre());
    }
}