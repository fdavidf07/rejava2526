package tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio15Excep {

	public static void main(String[] args) {
		try {
			
			System.out.print("Escribe un numero: ");
			Scanner scEntrada= new Scanner(System.in);
			int iNum1=scEntrada.nextInt();
			System.out.print("Escribe un numero: ");
			int iNum2=scEntrada.nextInt();
			int iResultado=iNum1/iNum2;
			System.out.print("\n El resultado es:"+iResultado);
			
			scEntrada.close();
		} catch (ArithmeticException ae1) {
			System.out.println("No se puede dividir por 0:"+ae1.getMessage());
			
		}catch (InputMismatchException ime) {
			System.out.println("Tiene que ser entero:"+ime.getMessage());
		}
	}

}
