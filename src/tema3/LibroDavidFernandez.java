package tema3;

public class LibroDavidFernandez {

	private String sTitulo;
    private String sAutor;
    private int iPaginasTotales;
    private int iPaginasLeidas;
    
    /**
     * Constructor
     * Sirve para crear más de la clase
     *
     */
    public LibroDavidFernandez(String titulo, String autor, int paginasTotales) {
        this.sTitulo = titulo;
        this.sAutor = autor;
        this.iPaginasTotales = paginasTotales;
        this.iPaginasLeidas = 0;
    }
    /**
     * Comprueba si el libro está terminado comparando las páginas leídas con
     * las totales
     *
     */
    public boolean estaTerminado() {
        return iPaginasLeidas >= iPaginasTotales;
    }

    /**
     * Devuelve el nombre del autor
     *
     */
    public String getAutor() {
        return sAutor;
    }

    /**
     * Devuelve la cantidad de páginas leídas
     *
     */
    public int getPaginasLeidas() {
        return iPaginasLeidas;
    }

    /**
     * Devuelve las páginas totales del libro
     *
     */
    public int getPaginasTotales() {
        return iPaginasTotales;
    }

    /**
     * Devuelve el título del libro
     *
     */
    public String getTitulo() {
        return sTitulo;
    }
    /**
     * Permite al usuario leer una cantidad determinada de páginas
     *
     */
    public void leer(int paginas) {
        iPaginasLeidas += paginas;
        
        if (iPaginasLeidas > iPaginasTotales) {
            iPaginasLeidas = iPaginasTotales;
        }
    }
    /**
     * Muestra toda la información del libro
     *
     */
    public void mostrarInformacion() {
        System.out.println("Título: " + sTitulo);
        System.out.println("Autor: " + sAutor);
        System.out.println("Páginas totales: " + getPaginasTotales());
        System.out.println("Páginas leídas: " + iPaginasLeidas);
        
       /* System.out.println("¿Terminado?: " + (estaTerminado() ? "Sí" : "No"));*/
    }
}