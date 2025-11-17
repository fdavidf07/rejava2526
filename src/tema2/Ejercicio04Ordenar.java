package tema2;
import java.util.Scanner;

public class Ejercicio04Ordenar  {
	//Pedimos 3 numeros y se pide que se ordene de mayor a menor
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n1,n2,n3;
		System.out.print("Introduce un número: ");
		n1 = sc.nextInt();
		System.out.print("Introduce otro número: ");
		n2 = sc.nextInt();
		System.out.print("Introduce otro número: ");
		n3 = sc.nextInt();
		if (n1>n2 && n2>n3) { 
			System.out.print("Numero Mayor es: "+n1);
		}
		if (n1>n2 && n1<n3) { 
			System.out.print("El mayor es el: "+n3);
		}
		if (n1<n2 && n2>n3) {
			System.out.print("El mayor es el: "+n2);
		}
	}

}
