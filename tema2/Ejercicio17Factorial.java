package tema2;

import java.util.Scanner;

public class Ejercicio17Factorial {

	public static void main(String[] args) {
		// Dado un numero pedido por pantalla mostrar el factorial
		//factorial de 8 =8*7*6*5*4*3*2*1
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();
        int factorial = 1;
        String cadena = "";

        for (int i = numero; i >= 1; i--) {
            factorial *= i;
            cadena += i;
            if (i > 1) {
                cadena += "*";
            }
        }

        System.out.println("Formaro Factorial: " + cadena);
        System.out.println("Factorial: " + factorial);
	}

}
