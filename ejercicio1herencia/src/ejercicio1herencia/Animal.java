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
public class Animal implements Alimentacion {
  String nombre, alimento,raza;
int edad; 

    public Animal() {
    }

    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public void alimento() {
        System.out.println("el animal" + nombre +"come" + alimento + "su edad" + edad); 
    }
       

}
