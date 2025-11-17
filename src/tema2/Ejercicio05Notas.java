package tema2;

import java.util.Scanner;

public class Ejercicio05Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int iNum;
		System.out.print("Introduce una nota del 0-10 : ");
		iNum = sc.nextInt();
		if (iNum>10 && iNum<0)
			System.out.print("No es una nota entre 0 y 10");
		else if (iNum>=5) {
			System.out.print("Ha aprobado");
		}
		else if (iNum<7)
			System.out.print("Bien");
		else {
			System.out.print("Ha suspendido");
		}
	}

}
