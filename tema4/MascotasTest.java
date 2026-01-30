package tema4;

public class MascotasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro perro= new Perro("Kai",2022,"Bodeguero",false);
		perro.tienePulgas();
		perro.calcularVacuna();
		perro.habla("Guau!");
		System.out.print(perro.toString());
		Loro loro= new Loro("Engel",2004,true,true, " Republica Dominicana");
		loro.habla(" hablo muchoo!!");
		System.out.print(loro.toString());
		
	}

}
