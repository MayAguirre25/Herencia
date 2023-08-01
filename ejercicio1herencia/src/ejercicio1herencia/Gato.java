/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1herencia;

/**
 *
 * @author aguir
 */
public class Gato extends Animal{

    public Gato() {
    }
public Gato(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
}
    @Override
    public void alimento() {
 System.out.println("el animal" + getNombre() +"come" + getAlimento() + "su edad" + getEdad());
    }
    
    
}
