/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Santos
 */
public class Calificacion {

  
    
    private String nombre;
      public Calificacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void mostrarCalificacion() {
        JOptionPane.showMessageDialog(null,  nombre); 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      
}
