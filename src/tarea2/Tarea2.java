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
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        usuario[] usuario= new usuario [2];
        usuario[0]= new usuario("Evelyn", "Pumay", 202112395);
        login ventanalogin=new login(usuario);
        ventanalogin.setVisible(true); 
        
    }
    
}
