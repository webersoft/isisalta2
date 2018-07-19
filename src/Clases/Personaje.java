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
public class Personaje {
  private String nombre; 
  private String nombreEnPelicula;
  private Rol rol;
  private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
  

    public Personaje(String nombre, String nombreEnPelicula, Rol rol) {
        this.nombre = nombre;
        this.nombreEnPelicula = nombreEnPelicula;
        this.rol = rol;
    }
    public Personaje getPersonaje(){
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
  
}
