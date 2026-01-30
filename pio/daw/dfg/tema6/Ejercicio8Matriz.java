package pio.daw.dfg.tema6;

import java.util.Arrays;

public class Ejercicio8Matriz {

	public static void main(String[] args) {
		int [][] matriz =new int[5][5];
		int numero=1;
		// Rellenar la matriz de numeros
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				matriz [i][j]= numero++;
			}
		}
		// pintamos el array
		for(int[]fila:matriz) {
			for (int elemento:fila) {
				System.out.print(elemento+"\t");
			}
			System.out.println();
		}
		
		// pintar matriz forma 2
		for(int i=0;i<5;i++) {
			System.out.println("\nMatriz forma2: "+Arrays.toString(matriz[i]));
		}
		
		// pintar matriz forma 3
		System.out.println("\nMatriz forma3: "+Arrays.deepToString(matriz));
	}

}
