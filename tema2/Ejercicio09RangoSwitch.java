package tema2;
import java.util.Scanner;
public class Ejercicio09RangoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int edad;
	 Scanner scEntrada= new Scanner(System.in);
	 System.out.print("Introduce la edad, solo edades entre 0 y 15:");
	 edad=scEntrada.nextInt();
	 switch(0<=edad && edad <=5 ?0:(6<=edad && edad <=10)?1:(11<=edad && edad>=15)?2:3) {
	 case 0 ->
	 System.out.print("Tienes entre 0 y 5 años");
	 case 1 ->
	 System.out.print("Tienes entre 6 y 10 años");
	 case 2 ->
	 System.out.print("Tienes entre 11 y 15 años");
	 case 3 ->
	 System.out.print("Fuera de rango");
	 }//fin switch
	 scEntrada.close();
	}

}
