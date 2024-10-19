package com.example;

public class Revista extends Material {
    private int numeroEdicion;
    private String mesPublicacion;

    
    public Revista(String titulo, String autor, int añoPublicacion, int numeroEdicion, String mesPublicacion) {
        super(titulo, autor, añoPublicacion); 
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String getTipoMaterial() {
        return "Revista";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifaBase = 3; 
        return diasPrestamo * tarifaBase;
    }

    public void mostrarDetallesRevista() {
        System.out.println("Detalles de la Revista:");
        System.out.println("Número de edición: " + numeroEdicion);
        System.out.println("Mes de publicación: " + mesPublicacion);
        mostrarInformacion(); 
    }

}
