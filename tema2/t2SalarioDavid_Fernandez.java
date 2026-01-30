package tema2;

import java.util.Scanner;

public class t2SalarioDavid_Fernandez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabajadas esta semana: ");
        int iHoras = sc.nextInt();

        System.out.print("Precio hora tarifa normal: ");
        double dPrecio = sc.nextDouble();
        sc.close();
        double dImpuestos=0;
        double dSalario;
        double dSalarioNeto;
        if (iHoras <= 35) {
            dSalario = iHoras * dPrecio;
        } else {
            int ihorasExtra = iHoras - 35;
            dSalario = (35 * dPrecio) + (ihorasExtra * dPrecio * 1.5);
        }System.out.println("El salario bruto es: " + dSalario);
        if (dSalario <= 500) {
            System.out.println("Los impuestos son 0");
        } else if (dSalario > 500 && dSalario < 900) {
        		dImpuestos = (dSalario - 500) * 0.25;
        System.out.println("Los impuestos son: " + dImpuestos);
        }else if (dSalario>900) {
        	dImpuestos= ((400 * 0.25)+ (dSalario-900)*0.45);
        }System.out.println("Los impuestos son: " + dImpuestos);
        dSalarioNeto = (dSalario-dImpuestos);
        System.out.println("El salario neto es: "+dSalarioNeto);
	}
}