package com.example;

public class Main {
    public static void main(String[] args) {
        
        Biblioteca miBiblioteca = new Biblioteca();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "1332323", 600);
        Libro libro2 = new Libro("pedropicapiedra", "George Orwell", 1949, "3132323", 2328);

        Revista revista1 = new Revista("Avon", "randell", 2023, 5, "Mayo");
        Revista revista2 = new Revista("Time", "Time Inc.", 2023, 4, "Abril");

        Audiovisual audiovisual1 = new Audiovisual("NBA", "Cristian", 2010, "Blu-ray", 148);
        Audiovisual audiovisual2 = new Audiovisual("La Rana", "sofia", 1999, "DVD", 136);

        miBiblioteca.agregarMaterial(libro1);
        miBiblioteca.agregarMaterial(libro2);
        miBiblioteca.agregarMaterial(revista1);
        miBiblioteca.agregarMaterial(revista2);
        miBiblioteca.agregarMaterial(audiovisual1);
        miBiblioteca.agregarMaterial(audiovisual2);

        miBiblioteca.mostrarCatalogo();

        String tituloABuscar = "pedropicapiedra";
        Material encontrado = miBiblioteca.buscarMaterial(tituloABuscar);
        if (encontrado != null) {
            System.out.println("Material encontrado:");
            encontrado.mostrarInformacion();
        } else {
            System.out.println("Material no encontrado.");
        }

        System.out.println("\nSimulando préstamos y devoluciones:");

        libro1.prestar();
        libro1.mostrarInformacion();

        libro1.devolver();
        libro1.mostrarInformacion();

        revista1.prestar();
        revista1.mostrarInformacion();

        revista1.devolver();
        revista1.mostrarInformacion();

        audiovisual1.prestar();
        audiovisual1.mostrarInformacion();
    }
    }
