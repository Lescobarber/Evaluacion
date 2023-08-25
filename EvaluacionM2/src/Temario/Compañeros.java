/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temario;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Compañeros {
    
    public static void main(String[] args) {
		  String[] nombres = new String[6]; //EL ARRAY NOMBRES CONTIENE DATOS DE TIPO STRING O CADENA Y SU LONGITUD ES 6 //
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingresa 6 nombres:");

        

  // SE USA UN CICLO FOR PARA LEER LOS NOMBRES QUE INGRESA EL USUARIO Y ASIGNARLOS AL ARRAY EN CADA INDICE//
       for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("\nNombres ingresados:");

        

     // USO DE CICLO PARA IMPRIMIR EL CONTENIDO DEL ARREGLO DE NOMBRES//
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("\nExtensión del arreglo:");
        System.out.println(" - Extensión: " + nombres.length); //SE USA ATRIBUTO LENGTH PARA IMPRMIR LA EXTENSION O LONGITUD DEL ARREGLO DE NOMBRES//

	}
}
    

