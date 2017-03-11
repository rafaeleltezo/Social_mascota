package com.example.rafaelp.socialmascotas;

/**
 * Created by Rafael p on 10/3/2017.
 */

public class Mascota {
    private String nombre;
    private int contador,imagen;

    public Mascota(String nombre,int contador,int imagen){
        this.nombre=nombre;
        this.contador=contador;
        this.imagen=imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
