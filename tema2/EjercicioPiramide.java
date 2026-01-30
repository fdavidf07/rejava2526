package tema2;

public class EjercicioPiramide {

	public static void main(String[] args) {
		pintarPiramide();
	}
	private static void pintarPiramide() {
		//5- pintar salto de linea
		//1- declaro variable para numero de filas
		int filas=5;
		//2- primer for desde 1 hastael numero de filas
		for (int i =1;i <=filas; i++){
		//3- pintar espacios en blanco para alinear
		for (int j = filas;j>i;j--) {
			System.out.print(" ");
		}//fin for j
			
		//4- pintar asteriscos
			for (int k = 1;k<=i;k++) {
				System.out.print("*");
			}// fin for k
		//5- pintar salto de linea
			System.out.println();
		}//fin for i
}
}


// fila 2 3 asteriscos
// fila 3 5 asteiscos
// fila 4 7 asteriscos