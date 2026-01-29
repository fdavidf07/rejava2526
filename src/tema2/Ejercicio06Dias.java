package tema2;

import java.util.Scanner;

public class Ejercicio06Dias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Dime un numero y t digo dia de la semana:");
		int iNum;
		iNum = sc.nextInt();
		if (iNum ==1)
			System.out.print("Lunes");
		else if (iNum == 2)
			System.out.print("Martes");
		else if (iNum == 3)
			System.out.print("Miercoles");
		else if (iNum == 4)
			System.out.print("Jueves");
		else if (iNum == 5)
			System.out.print("Viernes");
		else if (iNum == 6)
			System.out.print("Sabado");
		else if (iNum == 7)
			System.out.print("Domingo");
		else 
			System.out.print("No puede ser menor que uno ni mayor a 7");
		sc.close();
	}

}
