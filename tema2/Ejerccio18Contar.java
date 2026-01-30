package tema2;

import java.util.Random;

public class Ejerccio18Contar {

	public static void main(String[] args) {
		// Programa que genera 100 numeros aleatorios y muestra
		// 1 cuantos pares hay
		// 2 cuantos primos hay 
		Random random= new Random();
		int contadorpar=0;
		int contadorprimos=0;
		for (int i = 0;i<=100;i++) {
		int iNum= random.nextInt(5000);// numero entero aleatorio del 1 al 5000
		System.out.print(iNum);
		if (iNum %2==0) 
			contadorpar++;
		
		//Comprovamos Primos 
		if(Ejercicio14Primos3.funcionEsPrimo(iNum)) {
			contadorprimos++;
		}
		
		
		}//fin for
		System.out.print("\nHay "+contadorpar+" numeros pares");
		System.out.print("\nHay "+contadorprimos+" numeros primos");
		}
		

	}

