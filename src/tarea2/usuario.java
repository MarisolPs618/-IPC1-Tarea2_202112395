/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author maris
 */
public class usuario {
     
    String nombre; 
    String apellido; 
    
    int contraseña; 
    
    //constructor 
    usuario(String nombre, String apellido, int contraseña){
     
      this.nombre=nombre; 
      this.apellido=apellido;  
      this.contraseña=contraseña;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   
    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
