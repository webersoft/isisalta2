/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Santos
 */
public class Actor {
    private String Animado;
    private String nombre;
    private String Apellido;

    public Actor(String Animado, String nombre, String Apellido) {
        this.Animado = Animado;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public String getAnimado() {
        return Animado;
    }

    public void setAnimado(String Animado) {
        this.Animado = Animado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
}
