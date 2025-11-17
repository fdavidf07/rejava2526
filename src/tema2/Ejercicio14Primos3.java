package tema2;

import java.util.Scanner;

public class Ejercicio14Primos3 {
public static void main(String[] args) {
	System.out.println("Escribe un numero: ");
	Scanner scEntrada= new Scanner(System.in);
	int iNum=scEntrada.nextInt();
	scEntrada.close();
	boolean esPrimo= funcionEsPrimo(iNum);
	if(esPrimo)
		System.out.print("El numero "+iNum+" es primo");
	else
		System.out.print("El numero "+iNum+" no es primo");
	
}
protected static boolean funcionEsPrimo (int iNum) {
		boolean esPrimo=true;
		int i=2;
		while (i< Math.sqrt(iNum) && esPrimo) {
			if (iNum%i==0) {
				esPrimo=false;
			}
			i++;
		}//fin while
		return esPrimo;
}
}
