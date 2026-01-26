package pio.daw.dfg.tema5.animal;

/*una clase abstracta es una clase que declara la existencia de los metodos pero no su implementacion
 * Es decir, esta la cabezera pero no el codigo
 * 
 * Una clase abstracta puede tener metodos abstractos y no abstractos
 */
public abstract class AnimalAbstract {

	/* Meotdo abstracto*/
	 public abstract void hacerSonido();
	 
	 // metodo no abstracto
	 public void moverse() {
		 System.out.println("El animal se esta moviendo");	 
	 }
}
