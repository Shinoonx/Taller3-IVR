package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu();
    }
    public static void Menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa de eventos");
        System.out.println("Seleccione el tipo de evento:");
        System.out.println("1. Evento Informal");
        System.out.println("2. Evento Formal");
        int tipoEvento = scanner.nextInt();

        scanner.nextLine();


        System.out.println("Ingrese el nombre del evento:");
        String nombreEvento = scanner.nextLine();


        Evento evento;
        if (tipoEvento == 1) {
            evento = new EventoInformal(nombreEvento);
        } else {
            evento = new EventoFormal(nombreEvento);
        }


        System.out.println("¿Desea unir este evento a otro evento?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        int opcionUnirse = scanner.nextInt();

        if (opcionUnirse == 1) {

            scanner.nextLine();
            System.out.println("Ingrese el nombre del evento al que desea unirse:");
            String nombreEventoUnirse = scanner.nextLine();

            Evento eventoUnirse = new Evento(nombreEventoUnirse);

            evento.unirseA(eventoUnirse);
        }

        scanner.close();
    }
}