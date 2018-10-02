/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Metodos {
          private String nombre, apellido;
    private int dni;




public void getMetodo (String nombre) {
    System.out.println("Nombre: "+nombre);
}
public void getMetodo (String nombre, String apellido){
    System.out.println("Nombre: "+nombre+", Apellido: "+apellido);
}
public void getMetodo (String nombre, String apellido, int dni){
    System.out.println("Nombre: "+nombre+", Apellido: "+apellido+", DNI: "+dni);
}


}



