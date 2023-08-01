/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import ejercicio1herencia.Animal;
import ejercicio1herencia.Caballo;
import ejercicio1herencia.Gato;
import ejercicio1herencia.Perro;
import java.util.ArrayList;

/**
 *
 * @author aguir
 */
public class Service {
    ArrayList<Animal> pet = new ArrayList();
    
 public void crearAnimal(){
  Animal perro=new Perro("Fito", "Cani", "labrador", 2);
  Animal gato=new Gato("Paco", "wyskas", "angora", 5); 
  Animal caballo=new Caballo("Tormenta", "heno", "fino", 4);
  pet.add(gato);
  pet.add(perro);
  pet.add(caballo);
  
 }
 public void imprimir(){
     for (Animal animal : pet) {
         if (animal instanceof Perro) {
             Perro perro = (Perro) animal;
             alimentar(perro);
             continue;
             
         }
          if (animal instanceof Gato) {
             Gato gato = (Gato) animal;
             alimentar(gato);
             continue;
             
         }
    if (animal instanceof Caballo) {
             Caballo caballo = (Caballo) animal;
             alimentar(caballo);
             continue;
             
         }
     }
 }
 public void alimentar(Animal animal){
     animal.alimento();
     
     
 }
}
