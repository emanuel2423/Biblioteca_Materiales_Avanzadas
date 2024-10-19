package com.example;

public class Libro extends Material{
    private String isbn;
    private int numeroPaginas;

    
    public Libro(String titulo, String autor, int añoPublicacion, String isbn, int numeroPaginas) {
        super(titulo, autor, añoPublicacion); 
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String getTipoMaterial() {
        return "Libro";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifaBase = 1; 
        double recargo = (numeroPaginas > 500) ? 1.0 : 0.0; 
        return diasPrestamo * (tarifaBase + recargo);
    }

    public void mostrarDetallesLibro() {
        System.out.println("Detalles del Libro:");
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de páginas: " + numeroPaginas);
        mostrarInformacion(); 
    }

}
