package pio.daw.dfg.tema6;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[100];

        // Generar 100 números aleatorios decimales entre 0 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextDouble() * 100; 
        }

        // Mostrar los números generados
        System.out.println("Números generados:");
        for (double n : numeros) {
            System.out.print("< "+n+">"); 
        }
        System.out.println();

        // Pedir número decimal por pantalla
        System.out.print("Introduce un número decimal: ");
        double numUsuario = scanner.nextDouble();

        // Contar cuántos son mayores
        int contador = 0;
        for (double n : numeros) {
            if (n > numUsuario) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " números mayores que " + numUsuario);
    }
}
