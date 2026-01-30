package ArrayMatriz.pio.daw.dfg.tema6.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSet {
/* un HAshSet es una coleccion que almacena objetos sin orden especifico y
 * sin permitir duplicado
 * */
	public static void main(String[] args) {
		// Crear un HashSet de String 

		Set<String> nombres= new HashSet<> ();
		// añadir elementos al HAshSet
		nombres.add("Moha");
		nombres.add("Engel");
		nombres.add("Alvaro");
		nombres.add("David");
		nombres.add("Diego");
		//Mostrar
		System.out.println("Contenido del hashset: "+nombres);
		//verificar si un elemento existe
		System.out.println("Esta Diego?:"+nombres.contains("Diego"));
		// se nos va Moha
		nombres.remove("Moha");
		System.out.println("Contenido del hashset: "+nombres);
		
		// recoorer el hashset 
		for (String nombre:nombres) {
			System.out.println("----"+nombre);
		}
		// tamaño
			System.out.println("Tamaño del hashset: "+nombres.size());
			
		//Limpiar
			nombres.clear();
			System.out.println(nombres);
		
	}

}
