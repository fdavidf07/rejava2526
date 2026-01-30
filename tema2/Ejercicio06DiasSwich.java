package tema2;

import java.util.Scanner;

public class Ejercicio06DiasSwich {
 public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
		System.out.print("Dime un numero y t digo dia de la semana:");
		int iNum;
		iNum = sc.nextInt();
		switch (iNum) {
		case 1: 
			System.out.print("Lunes");
			break;
		case 2:
			System.out.print("Martes");
			break;
		case 3:
			System.out.print("Miercoles");
			break;
		case 4:
			System.out.print("Jueves");
			break;
		case 5:
			System.out.print("Viernes");
			break;
		case 6:
			System.out.print("Sabado");
			break;
		case 7:
			System.out.print("Domingo");
			break;
		default: System.out.print("Numero no valido");
		}
}
}
