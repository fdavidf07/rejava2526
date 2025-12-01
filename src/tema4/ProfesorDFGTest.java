package tema4;

import java.util.Calendar;

public class ProfesorDFGTest {
public static void main(String[] args) {
	Calendar fecha1 =Calendar.getInstance();
	fecha1.set(2019, 8, 19);
	Calendar fecha2= Calendar.getInstance();
	fecha2.set(2017, 0, 4);
	
	ProfesorInterinoDFG pi1= new ProfesorInterinoDFG("15565629F","Fernando", "Gonzalez", 34,fecha1);
	System.out.println(pi1);
	System.out.print(pi1.importeNomina(1300, 250, 100));
	
	
	ProfesorInterinoDFG pi2= new ProfesorInterinoDFG("25657892D", "Adrian", "Muñoz", 23,fecha2);
	System.out.println("\n"+pi2);
	System.out.print(pi2.importeNomina(1200, 165, 100));
}


}