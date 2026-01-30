package tema2;
import java.util.Scanner;
public class Ejercicio08Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scEntrada= new Scanner(System.in);
 int iNota;
 System.out.print("Dime la nuta numerica del 1-10:");
 iNota= scEntrada.nextInt();
 switch(iNota){
 	
 case 5,6 ->
 System.out.print("Bien");
 case 7,8 ->
 System.out.print("Notable");
 case 9,10 ->
 System.out.print("Sobresaliente");
 default->
 System.out.print("ERROR: debe ser un numero del 1-10");
 }
 scEntrada.close();
	}//fin switch

}
