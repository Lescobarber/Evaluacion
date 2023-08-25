/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Temario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Seven {
    
     public static void main(String[] args) {
        //DECLARAR EL ARRAYLIST QUE CONTIENE DATOS DE TIPO ENTERO Y CUYO NNOMBRE ES NUMEROS ENTEROS, OBSERVE QUE SE DEFINE LA DIMENSION O LONGITUD DE FORMA PRELIMINAR, SIGNIFA QUE PUEDO AGREGAR LA CANTIDAD DE ELEMENTOS                  DESEADOS//   
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int contador = 0; //SE INICIA CONTADOR PARA CONTROL DE CICLO DO WHILE//

        System.out.println("Agrega 7 números:");
        // ESTRUCTURA DE CICLO DO WHILE: AGREGAR UN NUMERO AL ARRAYLIST HASTA QUE... //
        do {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            contador++;
        } while (contador < 7); //...CONTADOR SEA MENOR QUE 7. ESTO QUIERE DECIR QUE SE AGREGAN VALORES AL ARRAYLIST EN LOS INDICES 0 1 2 3 4 5 6 Y CUANDO CONTADOR LLEGA A 7 CICLO FINALIZA//

        System.out.println("\nNúmeros agregados:");

        for (int num : numeros) {  //MEDIANTE CICLO FOR SE IMPRIMEN LOS ELEMENTOS DEL ARRAY. EN ESTE CASO EL CICLO FOR SE DECLARA DE FORMA SIMPLIFICADA//
            System.out.println(num);
        }
	}
}
    

