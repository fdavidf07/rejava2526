package tema2;
import java.util.Scanner;

public class Ejercicio03Mayor  {
	//Pedimos numero y mostramos por pantalla
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int iNum,iNum2;
		System.out.print("Introduce un número: ");
		iNum = sc.nextInt();
		System.out.print("Introduce otro número: ");
		iNum2 = sc.nextInt();
		if (iNum>iNum2) {
			System.out.print("Numero Mayor es: "+iNum);
		}
		else if (iNum<iNum2){
			System.out.print("Numero Mayor es: "+iNum2);
		}
		else {
			System.out.print("Son iguales");
		}
	}
}