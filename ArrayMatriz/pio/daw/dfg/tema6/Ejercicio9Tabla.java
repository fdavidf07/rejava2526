package pio.daw.dfg.tema6;

public class Ejercicio9Tabla {

	public static void main(String[] args) {
		// Pinta la tabla de multiplicar del xxx
		int [][] tablaResultados= new int [10][10];
		int i=1;
		int j=1;
		for (i =1;i <11;i++) {
			for( j=1;j<11;j++) {
				tablaResultados[i-1][j-1]=i*j;
			}
		}
		for(int[]fila:tablaResultados) {
			for (int elemento:fila) {
				System.out.print(elemento+"\t");
			}
			System.out.println();
		}
		
	}
}
