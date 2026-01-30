package pio.daw.dfg.tema6.matrizreto;

import java.util.Scanner;

public class SolucionDFG implements interfazSombra {

	@Override
	public void resolver() {
		// TODO Auto-generated method stub
		String[][] matriz;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero de filas: ");
		int filas =sc.nextInt();
		System.out.println("Introduce numero de columnas: ");
		int columnas =sc.nextInt();
		System.out.println("Introduce el numero de arboles en la parcela: ");
		int arboles=sc.nextInt();
	}   
		
		
   

	public static void main(String[] args) {
		// Llamamos al metodo resolver
		new SolucionDFG().resolver();

		/*
		 * el programa pedira 2 cosas.1 tres numeros que indican columnas filas y
		 * numeros de arboles.2 Bucle en el que pedira posicion de cada arbol
		 *
		 * 
		 */
	}

}
