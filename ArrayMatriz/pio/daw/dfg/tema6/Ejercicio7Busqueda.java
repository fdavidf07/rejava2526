package pio.daw.dfg.tema6;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7Busqueda {

	public static void main(String[] args) {
		int[] numeros= new int[40];
		
		//40 numeros aleatorios entre 0 y 100
		for (int i =0; i <numeros.length;i++) {
			numeros[i]=(int) (Math.random()*100);
		}
		//Para Mostrar  el siguiente Array:
		//System.out.printlm(Arrays.toString(numeros)):
		
		
		//ordenar el array
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		
		//Pedir numero al usuario
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce e numero a buscar; ");
		int objetivo=sc.nextInt();
		
		// metodo buscar que le paso el numero y el array a buscar y devuelve la posicion
		
		
	}
}
