package pio.daw.dfg.tema5.animal;

public class AnimalTest {

	public static void main(String[] args) {
		AnimalGato gato= new AnimalGato();
		AnimalPerro perro= new AnimalPerro();
		System.out.println("Ejemplo de herencia y polimorfismo.Clase Perro:");
		perro.hacerSonido();
		perro.moverse();
		perro.buscarPelota();
		System.out.println();
		System.out.println("Ejemplo de herencia y polimorfismo.Clase Gato:");
		gato.hacerSonido();
		gato.moverse();
		gato.arañar();
	}
}
