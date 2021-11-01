/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.util.Scanner;

/**
 *
 * @author mruizpta
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Cual es tu edad?");
          Scanner reader = new Scanner(System.in);
            System.out.println("Cual es tu nombre?");
          Scanner reader2 = new Scanner(System.in);
            System.out.println("Cual es tu apellido?");

          Scanner reader3 = new Scanner(System.in);
            System.out.println("Cual es tu hobbie?");
          Scanner reader4 = new Scanner(System.in);
            System.out.println("Cual es tu IDE?");
          Scanner reader5 = new Scanner(System.in);
            System.out.println("Cual es tu SO favorito?");
          Scanner reader6 = new Scanner(System.in);
          int edad = 0;
            edad = reader.nextInt();
          String nombre ="";
            nombre = reader2.nextLine();
          String apellido ="";
            apellido = reader3.nextLine();
           String hobbie ="";
            hobbie = reader4.nextLine();
           String IDE ="";
            IDE = reader5.nextLine();
           String SO ="";
            SO = reader6.nextLine();
          
         System.out.println("El nombre es "+ nombre);
         System.out.println("El apellido es "+ apellido);
         System.out.println("La edad es "+ edad);
         System.out.println("El Hobbie es "+ hobbie);
         System.out.println("El nombre IDE favorito es "+ IDE);
         System.out.println("El Sistema operaativo  es "+ SO);

      
        
        
       
    }
    
}
