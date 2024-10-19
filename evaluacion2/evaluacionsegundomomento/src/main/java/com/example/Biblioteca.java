package com.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
        private List<Material> materiales;

    public Biblioteca() {
        materiales = new ArrayList<>();
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
        System.out.println("Material agregado: " + material.titulo);
    }

    public Material buscarMaterial(String titulo) {
        for (Material material : materiales) {
            if (material.titulo.equalsIgnoreCase(titulo)) {
                return material; 
            }
        }
        return null; 
    }

    public void mostrarCatalogo() {
        System.out.println("Catálogo de Materiales:");
        for (Material material : materiales) {
            material.mostrarInformacion(); 
            System.out.println(); 
        }
    }


}
