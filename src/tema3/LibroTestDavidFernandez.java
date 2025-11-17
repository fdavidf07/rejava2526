package tema3;

public class LibroTestDavidFernandez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibroDavidFernandez Libro = new LibroDavidFernandez("Cien años de soledas", "Gabriel García Márquez", 417);
				
		Libro.mostrarInformacion();
		System.out.println("");
		Libro.leer(100);
		System.out.println("Has leído " + Libro.getPaginasLeidas() + " de " + Libro.getPaginasTotales() + " páginas");
		Libro.leer(200);
		System.out.println("Has leído " 
		+ Libro.getPaginasLeidas() + " de " 
		+ Libro.getPaginasTotales() + " páginas");
				
		Libro.leer(200);
		System.out.println("Has leído " 
		+ Libro.getPaginasLeidas() + " de " 
		+ Libro.getPaginasTotales() + " páginas");
		
		if(Libro.estaTerminado()) {
			System.out.println("¡Has terminado el libro!");
			System.out.println("");
		}
	
		Libro.mostrarInformacion();
	}

}
