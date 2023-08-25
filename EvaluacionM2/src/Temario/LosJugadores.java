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
public class LosJugadores {
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
        
        String[][] jugadores = new String[3][4];  // Crear matriz 3x4 para almacenar jugadores//
         //MATRIZ TIPOS CADENA Y DIMENSIONES: FILAS 3 Y COLUMNAS 4. RECORDAR QUE SI HABLAMOS DE 3 FILAS ESTAMOS HABLANDO DE LOS INDICES 0, 1 Y 2 Y QUE SI HABLAMOS DE 4 COLUMNAS ESTAMOS HABLANDO DE LOS INDICES 0 1 2 3, (MATRIZ DECLARADA)// 
        // Llenar la matriz con los datos de jugadores//
        jugadores[0][0] = "Jugador 1"; // AHORA INICIAMOS EL LLENADO DE LA MATRIZ. EN LA FILA 0 COLUMNA 0 ASIGNAMOS EL VALOR JUGADOR 1//
        jugadores[0][1] = "Juan"; // EN FILA 0 COLUMNA 1 ASIGNAMOS EL VALOR "JUAN"//
        jugadores[0][2] = "15 años";  // EN FILA 0 COLUMNA 2 ASIGNAMOS EL VALOR "15 AÑOS"//
        jugadores[0][3] = "delantero";  // EN FILA 0 COLUMNA 3 ASIGNAMOS EL VALOR "DELANTERO"//
        
        jugadores[1][0] = "Jugador 2";
        jugadores[1][1] = "Pedro";
        jugadores[1][2] = "16 años";
        jugadores[1][3] = "defensa";
        
        jugadores[2][0] = "Jugador 3";
        jugadores[2][1] = "Luis";
        jugadores[2][2] = "17 años";
        jugadores[2][3] = "arquero";
        // ASIGNACION AUTOMATICA//

        // Recorrer e imprimir la matriz// //LOOP ANIDADOS RECORRIENDO X FILAS Y COLUMNAS// 
        System.out.println("Matriz de jugadores:");
        for (int fila = 0; fila < jugadores.length; fila++) { //RECORRIDO POR FILAS//
            for (int columna = 0; columna < jugadores[fila].length; columna++) { //RECORRIDO POR COLUMNAS//
                System.out.print(jugadores[fila][columna] + " \t");
            }
            System.out.println();  // Cambiar de línea después de cada fila//
        }
		System.out.print(jugadores[2][3]); //Posición de "arquero"//
		System.out.print(jugadores[1][2]); //Posición de "16 años"//
	}
}

    

