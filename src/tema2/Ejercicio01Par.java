package tema2;

import java.util.Scanner;

public class Ejercicio01Par {
	//Pedimos numero y mostramos por pantalla
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int iNum;
		System.out.print("Introduce un número: ");
		iNum = sc.nextInt();
		// Comprobamos si es par
		if (iNum%2 ==0) {
			System.out.print("Es par");
		}
		else {
			System.out.print("Es impar");
		}
	}

}
