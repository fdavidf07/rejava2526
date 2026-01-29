package pio.daw.dfg.tema6;

import java.util.Scanner;

public class Ejercicio5Altura {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce el número de personas N: ");
	        int valorN = sc.nextInt();

	        double[] alturas = new double[valorN];

	        for (int num = 0; num < valorN; num++) {
	            System.out.print("Introduce la altura de la persona " + (num + 1) + " (en metros): ");
	            alturas[num] = sc.nextDouble();
	        }

	        // Llamada a los métodos lógicos
	        double media = calcularMedia(alturas);

	        System.out.println("Altura media: " + media);
	        System.out.println("Altura máxima: " + calcularMaximo(alturas));
	        System.out.println("Altura mínima: " + calcularMinimo(alturas));
	        System.out.println("Personas sobre la media: " + contarSobreMedia(alturas, media));
	        System.out.println("Personas bajo la media: " + contarBajoMedia(alturas, media));

	        sc.close();
	    }

	    // MÉTODOS PARA CÁLCULOS

	    public static double calcularMedia(double[] array) {
	        double suma = 0;
	        for (int i = 0; i < array.length; i++) {
	            suma += array[i];
	        }
	        return suma / array.length;
	    }

	    public static double calcularMaximo(double[] array) {
	        double max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        return max;
	    }

	    public static double calcularMinimo(double[] array) {
	        double min = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }
	        return min;
	    }

	    public static int contarSobreMedia(double[] array, double media) {
	        int contador = 0;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] > media) {
	                contador++;
	            }
	        }
	        return contador;
	    }

	    public static int contarBajoMedia(double[] array, double media) {
	        int contador = 0;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] < media) {
	                contador++;
	            }
	        }
	        return contador;
	    }
	}
