package pio.daw.dfg.tema6;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// llamamos al método que pide 10 números por consola
		double[] lista10Num = pide10Num();

		// Método que recorre y hace el cálculo
		muestraMaxMin(lista10Num);
	}

	// Método que pide 10 números por consola
	private static double[] pide10Num() {
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[10];
		System.out.println("Introduce 10 números decimales :");
		for (int cont = 0; cont < numeros.length; cont++) {
			System.out.print("Número " + (cont + 1) + ": ");
			numeros[cont] = sc.nextDouble();
		}
		// Mostrar los números usando for-each
		System.out.println("\nNúmeros introducidos:");
		for (double num : numeros) {
			System.out.println(num + " ");
		}
		sc.close();
		return numeros;
	}

	// Método que recorre y hace el cálculo
	private static void muestraMaxMin(double[] array10Num) {
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;

		for (double n : array10Num) {
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
		}

		System.out.println("\nRESULTADOS:");
		System.out.println("Valor máximo: " + max);
		System.out.println("Valor mínimo: " + min);
	}
}
