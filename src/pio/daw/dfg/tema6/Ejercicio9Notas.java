package pio.daw.dfg.tema6;

import java.awt.ItemSelectable;
import java.util.Arrays;

public class Ejercicio9Notas {

	public static void main(String[] args) {
	        double[][] notas = new double[4][5];
	        String[] nombresAlumnos = {"Turing", "Lovelace", "Berners-Lee", "Gates"};
	        String[] nombresAsignaturas = {"BBDD", "Programación", "Entornos", "Marcas", "Sostenibilidad"};

	        /* 1. Asignación aleatoria
	         for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 5; j++) {
	               notas[i][j] = generarNotaAleatoria();
	                	
	        }

	        // 2. Mostrar las notas por consola

	        
	        // 3. Cálculos estadísticos
	      for (int i = 0; i < 4; i++) {
	            System.out.println("\nEstadísticas de " + nombresAlumnos[i] + ":");
	            System.out.println("  Nota mínima: " + calcularMinima(notas[i]));
	            System.out.println("  Nota máxima: " + calcularMaxima(notas[i]));
	            System.out.println("  Nota media: " + calcularMedia(notas[i]));
	        }
	    }

	private static double generarNotaAleatoria() {

		double randomNumber = Math.random() * 10 + 1;
		return randomNumber;
	}*/
}
}
