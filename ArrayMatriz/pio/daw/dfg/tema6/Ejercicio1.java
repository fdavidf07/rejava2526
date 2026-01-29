package pio.daw.dfg.tema6;

import java.util.Scanner;

public class Ejercicio1 {
	/* programa que pide 10 numeros por pantalla, los guarda en un array y 
	 * los muestra por pantalla*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// valores decimales, 64 bits memoria con precision mayor que float
		double[] numeros= new double [10];
		for (int cont=0; cont <10;cont ++) {
			System.out.print("Introduce el numero decimal usando ,:");
			numeros[cont]= sc.nextDouble();
		}
		System.out.println("Los valores introducidos son: ");
		for (double num:numeros) {
			System.out.print(num+" ");
		}
	}

}
