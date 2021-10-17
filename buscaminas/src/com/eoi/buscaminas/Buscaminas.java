package com.eoi.buscaminas;

import java.io.*;
import java.util.*;

// ################################################################################
// Implementar el juego del BUSCAMINAS en lenguaje Java.
// En el c�digo se dispone de las cabeceras de todas las funciones a desarrollar
// y una breve explicaci�n de lo que debe realizar.
// Cada alumno programar� la/las funci�n/es que le indique el profesor. El resto no las tocar�.  
// La �nica funci�n que ya est� hecha es la funci�n main.
// Cada alumno debe realizar unas pruebas m�nimas de que su funci�n es correcta.
// ################################################################################

public class Buscaminas {

	// ################################################################################
	// Funci�n max: Funci�n auxiliar que calcula el m�ximo de dos n�meros
	// ################################################################################
	public static int max(int num1, int num2) {
		// por realizar
		return 0;
	}

	// ################################################################################
	// Funci�n min: Funci�n auxiliar que calcula el m�nimo de dos n�meros
	// ################################################################################
	public static int min(int num1, int num2) {
		// por realizar
		return 0;
	}

	// ################################################################################
	// Funci�n IncializarTablero: Funci�n que recibe las dos talbas: tablero,
	// visible
	// Incializa tablero con valores 0
	// Incializa visible con valores Falso, indicando que est�n ocultas
	// ################################################################################
	public static void inicializartablero(int tablero[][], boolean visible[][]) {
		// por realizar
	}

	// ################################################################################
	// Funci�n PonerMinas: Funci�n que recibe el tablero (tabla 10x10) por
	// referencia
	// Genera 10 posiciones de la tabla e incializa esas posiciones con minas (valor
	// 9)
	// Debe asegurar que se ponen 10 minas.
	// Cada vez que se pone una mina se incrementa en 1 el valor de las celdas
	// vecinas,
	// si no son una mina
	// ################################################################################
	public static void ponerminas(int tablero[][]) {
		// por realizar
	}

	// ################################################################################
	// Funci�n DestaparCelda: Funcion que recibe por referencia las dos tablas y la
	// fila y columna que se debe destapar.
	// Si es una casilla que se puede destapar (la posici�n de la tabla visible es
	// Falso)
	// Se destapa (posici�n de la tabla visible a Verdadero)
	// Si no hay minas cerca tengo que intentar destapar las vecinas
	// Si la celda vecina no es una mina, la destapo
	// Funci�n recursiva
	// ################################################################################
	public static void destaparcelda(int tablero[][], boolean visible[][], int fila, int colum) {
		// por realizar
	}

	// ################################################################################
	// Funci�n ContarCeldasDestapadas: Funcion que recibe la tabla visible
	// Recorre la tabla y cuenta los valores Verdaderos, este valor se devuelve
	// Si el contador es 90 significa que hemos destapado todas las casillas: hemos
	// ganado
	// ################################################################################
	public static int contarceldasdestapadas(boolean visible[][]) {
		// por realizar
		return 0;
	}

	// ################################################################################
	// Funci�n ComprobarTablero: Funcion que recibe por referencia las dos tablas y
	// la
	// fila y columna que se debe destapar.
	// Si la posici�n a destapar es una mina (=9) devuelve -1 (hemos perdido)
	// SiNo destapo la casilla correspondiente y cuento las casillas detapadas y se
	// devuelve
	// ################################################################################
	public static int comprobartablero(int tablero[][], boolean visible[][], int fila, int colum) {
		// por realizar
		return 0;
	}

	// ################################################################################
	// Funci�n EscribirTablero: Funcion que las dos tablas
	// Recorre las tablas y las muestras en pantalla
	// Dependiendo del valor de cada posici�n de la tabla visible, muestra la
	// posici�n
	// de la tabla resultado.
	// Si la posici�n est� destapada (verdadero):
	// Si no tiene minas alrededor (valor 0) muestra un hueco
	// Si es una mina, muestro un *
	// SiNo muetro el valor de la casilla (indica cuantas minas tiene alrededor)
	// SiNo la posici�n no es visible y muestro un #
	// ################################################################################
	public static void escribirtablero(int tablero[][], boolean visible[][]) {
		// por realizar
	}

	public static void main(String[] args) throws IOException {
		Scanner leer = new Scanner(System.in);
		int colum;
		int fila;
		int resultado;
		int tablero[][];
		boolean visible[][];
		tablero = new int[10][10];
		visible = new boolean[10][10];
		inicializartablero(tablero, visible);
		do {
			escribirtablero(tablero, visible);
			// Pedir fila y columna de casilla a destapar
			do {
				System.out.print("Indica fila:");
				fila = leer.nextInt();
			} while (!(fila >= 0 && fila <= 9));
			do {
				System.out.print("Indica columna:");
				colum = leer.nextInt();
			} while (!(colum >= 0 && colum <= 9));
			// Comprobamos el tablero
			resultado = comprobartablero(tablero, visible, fila, colum);
			System.out.println(""); // no hay forma directa de borrar la consola en Java
		} while (!(resultado == -1 || resultado == 90));
		escribirtablero(tablero, visible);
		// Has destapado una mina
		if (resultado == -1) {
			System.out.println("Has pisado una mina!!!!!");
			System.out.println("GAME OVER");
			// has destapado todas las casillas
		} else {
			System.out.println("YOU ARE THE PLAYER ONE!!!");
		}
		leer.close();
	}

}
