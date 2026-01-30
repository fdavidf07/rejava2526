package tema2;

import java.util.Scanner;

public class EjercicioBici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scEntrada= new Scanner(System.in);
int increm,iDistAct=0,iDistTot=0;
do {
	System.out.print("Introduce un número (0 para salir): ");
	increm = scEntrada.nextInt();
	if (increm !=0) {
		iDistAct+=increm;
		iDistTot+=iDistAct*2;
	}
}//fin do 
while (increm != 0);

System.out.print("Ha hecho "+ iDistTot+"Km totales");
scEntrada.close();
}

}
