/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author patri
 */
public class Categoria {
   private int id;
    private String nombre;
    private boolean habilitado;

    public Categoria() {
        this.id = 0;
        this.nombre = "";
        this.habilitado = false;
    }
    
    public Categoria(int id, String nombre, boolean habilitado) {
        this.id = id;
        this.nombre = nombre;
        this.habilitado = habilitado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void limpiar()
    {
        this.id = 0;
        this.nombre = "";
        this.habilitado = false; 
    } 

    @Override
    public String toString() {
        return nombre;
    }
    
}
