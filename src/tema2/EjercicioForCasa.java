package tema2;
import java.util.Scanner;
public class EjercicioForCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime cuanto es el lado:");
		int n=sc.nextInt();
		int filas,columnas;
		for (filas=1; filas<=n;filas++) {
			System.out.print("*");
			for (columnas=1;columnas<=n;columnas++) {
				System.out.print("*");
			}//fin for columnas
			System.out.println(" ");
		}//fin for filas
	}

}
