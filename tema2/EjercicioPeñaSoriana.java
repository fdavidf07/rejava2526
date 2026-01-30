package tema2;

import java.util.Scanner;

public class EjercicioPeñaSoriana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.print("Martes:");
int M=sc.nextInt();
System.out.print("Miercoles:");
int X=sc.nextInt();
System.out.print("Jueves:");
int J=sc.nextInt();
System.out.print("Viernes:");
int V=sc.nextInt();
System.out.print("Sabado:");
int S=sc.nextInt();
System.out.print("Domingo:");
int D=sc.nextInt();
int iDiaMayor=M;
if (X>iDiaMayor) {
	iDiaMayor = X;}
if (J>iDiaMayor) {
	iDiaMayor =J;}
if (V>iDiaMayor) {
	iDiaMayor = V;}
if (S>iDiaMayor) {
	iDiaMayor = S;}
if (D>iDiaMayor) {
	iDiaMayor = D;}
System.out.print("El mejor dia fue: "+iDiaMayor);
int iDiaPeor=M;
if (X<iDiaPeor) {
	iDiaPeor = X;}
if (J<iDiaPeor) {
	iDiaPeor =J;}
if (V>iDiaMayor) {
	iDiaPeor = V;}
if (S<iDiaPeor) {
	iDiaPeor = S;}
if (D<iDiaPeor) {
	iDiaPeor = D;}
System.out.print("\nEl peor dia es: "+iDiaPeor);
int Media=(M+X+J+V+S+D)/6;
if (Media>D)
	System.out.print("\nNO");
else System.out.print("\nSI");
}
	}


