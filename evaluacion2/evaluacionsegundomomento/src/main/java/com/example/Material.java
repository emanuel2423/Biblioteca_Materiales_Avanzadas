package com.example;

public abstract class Material {

    protected String titulo;
    protected String autor;
    protected int añoPublicacion;
    protected boolean disponible;

    
    public Material(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true; 
    }

    public void mostrarInformacion() {
        System.out.println("título: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("año de publicación: " + añoPublicacion);
        System.out.println("disponible: " + (disponible ? "Sí" : "No"));
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El material ha sido prestado.");
        } else {
            System.out.println("El material no está disponible para préstamo.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("El material ha sido devuelto.");
    }

    public abstract String getTipoMaterial();

    public abstract double calcularTarifaPrestamo(int diasPrestamo);
}

