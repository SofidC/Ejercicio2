/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2github;

/**
 *
 * @author Sofia
 */
public class Perro {
   // atributos
   String nombre;
   int edad;
   String raza;
   
   // constructor
   public Perro(String nombre, int edad, String raza) {
      this.nombre = nombre;
      this.edad = edad;
      this.raza = raza;
   }
   
   // métodos
   public void ladrar() {
      System.out.println("¡Guau, guau!");
   }
   
   public void correr() {
      System.out.println("El perro está corriendo.");
   }
   
   public void dormir() {
      System.out.println("El perro está durmiendo.");
   }
}
