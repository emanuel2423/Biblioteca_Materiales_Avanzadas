package com.example;

public class Audiovisual extends Material {
    private String formato;
    private int duracion; 

    public Audiovisual(String titulo, String autor, int añoPublicacion, String formato, int duracion) {
        super(titulo, autor, añoPublicacion); 
        this.formato = formato;
        this.duracion = duracion;
    }

    @Override
    public String getTipoMaterial() {
        return "Audiovisual";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifaBase = 4; 
        double recargo = formato.equalsIgnoreCase("Blu-ray") ? 1.5 : 0.0; 
        return diasPrestamo * (tarifaBase + recargo);
    }

    public void mostrarDetallesAudiovisual() {
        System.out.println("Detalles del Material Audiovisual:");
        System.out.println("Formato: " + formato);
        System.out.println("Duración: " + duracion + " minutos");
        mostrarInformacion(); 
    }

}
