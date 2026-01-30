package tema2;
import java.util.Scanner;

public class Ejercicio02Iguales  {
	//Pedimos numero y mostramos por pantalla
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int iNum,iNum2;
		System.out.print("Introduce un número: ");
		iNum = sc.nextInt();
		System.out.print("Introduce otro número: ");
		iNum2 = sc.nextInt();
		if (iNum==iNum2) {
			System.out.print("Son iguales");
		}
		else {
			System.out.print("No son iguales");
		}
	}

}

