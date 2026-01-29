package pio.daw.dfg.tema6;

import java.util.Random;

// ejercicio que dados 20 numeros muestra
// la suma y la resta

public class Ejercicio3 {

	public static void main(String[] args) {
		int cont;
		Random random=new Random();
		
		int []numeros= new int [20];
		System.out.println("20 Números enteros :");
		for (cont =1;cont<numeros.length;cont++) {
			numeros[cont]=random.nextInt(200);
			
		}
		for (int numero:numeros) {
			System.out.println("Numeros :"+numero);
		}
	}
}
