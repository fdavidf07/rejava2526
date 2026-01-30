package tema2;

import java.util.Scanner;

public class Ejercicio16Binario {

	public static void main(String[] args) {
		//Programa que lee un numero en decimal y lo convierte en binario
		//los binarios se hacen dividiendo entre dos ese numero y cogiendo los restos del ultimo al primero
	String sCadena="";
		Scanner scEntrada= new Scanner(System.in);
	System.out.print("Escribe un numero: ");
	double dNum= scEntrada.nextDouble();
	double dCociente=dNum;
	scEntrada.close();
	//Pasar a binario
	// 
	while(dCociente>1) {
	sCadena=((int)(dCociente%2))+ sCadena;
	dCociente/=2;// (divido siempre el cociente entre dos) = numero=numero /2
	}// fin while
	System.out.print("El numero binario es: "+sCadena);
	

	}

}
