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
public class EdadesEnFamilia {
    
     public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	   
        int[][] edades = new int[3][3];  // Crear matriz 3x3 para almacenar edades

// DOS CORCHETES: ARREGLO DE DOS DIMENSIONES//
// INT TIPO DE DATOS QUE VA DENTRO DEL ARREGLO (DESPUES DE ASIGNACION SE CREA LA NUEVA INSTANCIA DE ARREGLO DE DOS DIMENSIONES Y ENTRE CORCHETES SE INDICA LA LONGITUD DE CADA DIMENSION)
// LA LONGITUD 3 QUIERE QUE LAS INDICES DEL AREEGLO SON O 1 Y 2 = DECLARAR MATRIZ//

        // Llenar la matriz con algunas edades de ejemplo//
       
        edades[0][0] = 25; //AL ARREGLO "EDADES" ASIGNAMOS EN LA FILA O COLUMNA 0 EL VALOR 25 Y ASI SUCESIVAMENTE (LLENADO DE MATRIZ O ASIGNACION DE VALORES)//						
        edades[0][1] = 32;
        edades[0][2] = 19;
        edades[1][0] = 40;
        edades[1][1] = 18;
        edades[1][2] = 27;
        edades[2][0] = 22;
        edades[2][1] = 35;
        edades[2][2] = 29;

        // Recorrer e imprimir la matriz//
        // LOOP = CICLO YA SE CON FOR, WHILE Y DO WHILE. COMO ESTAMOS EN ARRAY DE DOS DIMENSIONES, SE REQUIERE DE LOOP ANIDADO ( LOOP DE LOOP)//
        System.out.println("Matriz de edades:");
        for (int fila = 0; fila < edades.length; fila++) { //ESTE LOOP SE REALIZA POR FILAS E IRA RECORRIENDO         RENGLONES DE LA MATRIZ O FILAS 
            for (int columna = 0; columna < edades[fila].length; columna++) { // ESTE LOOP SE REALIZA POR COLUMNAS O ESPACIOS VERTICALES DE LA MATRIZ//
                System.out.print(edades[fila][columna] + "\t");
            } // LA INSTRUCCION FOR REQUIERE DE TRES PARAMETROS:1- POSICION INICIAL; 2- CONDICION ANTES DE LA POSICION FINAL; 3- SALTO U OPERACION DE AUMENNTO ENTRE POSICIONES// 
            System.out.println();  // Cambiar de línea después de cada fila//
        }

	}
}
    

