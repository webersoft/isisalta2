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

public class Pelicula {
    private int anio_Estreno;
    private boolean diponible;
    private float duracion;
    private String nombre;
    private String titulo_Original; 
    
    private Calificacion calificacion;
    private Comentario comentario;
    private Genero genero;
    private PaisDeOrigen paisdeOrigen;


    
    
    
    public Pelicula(int anio_Estreno, boolean diponible, float duracion, String nombre, String titulo_Original) {
        this.anio_Estreno = anio_Estreno;
        this.diponible = diponible;
        this.duracion = duracion;
        this.nombre = nombre;
        this.titulo_Original = titulo_Original;
    }
    public int getAnio_Estreno() {
        return anio_Estreno;
    }

    public void setAnio_Estreno(int anio_Estreno) {
        this.anio_Estreno = anio_Estreno;
    }

    public boolean isDiponible() {
        return diponible;
    }

    public void setDiponible(boolean diponible) {
        this.diponible = diponible;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo_Original() {
        return titulo_Original;
    }

    public void setTitulo_Original(String titulo_Original) {
        this.titulo_Original = titulo_Original;
    }

    
    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public PaisDeOrigen getPaisdeOrigen() {
        return paisdeOrigen;
    }

    public void setPaisdeOrigen(PaisDeOrigen paisdeOrigen) {
        this.paisdeOrigen = paisdeOrigen;
    }
    
    
    

    @Override
    public String toString() {
        return "Pelicula{" + "anio_Estreno=" + anio_Estreno + ", diponible=" + diponible + ", duracion=" + duracion + ", nombre=" + nombre + ", titulo_Original=" + titulo_Original + '}';
    }
}
