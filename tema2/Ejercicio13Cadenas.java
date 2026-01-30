package tema2;
import java.util.Scanner;

public class Ejercicio13Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str1="name";
   String str2="name";
   String str3= new String("name");
   String str4=("Name");
   System.out.println(str1.equals(str2));
   System.out.println(str1==str2);
   System.out.println(str1.equals(str3));
   System.out.println(str1==str3);
   //ahora el 1 y el 4
   System.out.println(str1==str4);
   System.out.println(str1.equalsIgnoreCase(str4));// si ponemos equalsIgnoreCase ignora las mayusculas y si da true
   
	}

}
