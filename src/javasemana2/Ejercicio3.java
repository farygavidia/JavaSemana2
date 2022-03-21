
package javasemana2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
3-. Una agencia de venta de autos paga a su personal de ventas un salario de $800,00 más una comisión de $170,00 por auto
* vendido más un 5% del valor de venta. Diseñar un programa para calcular el salario de un vendedor en un determinado
mes, conociendo el nº de automóviles vendidos y el total del monto de ventas. Imprimir el nombre del vendedor y el salario
devengado por este
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("#,###.##");
        int autos_vendidos=0;
        double total_venta=0, sueldo_total=0;
        String nombre_vendedor;
        
        System.out.println("Ingrese el nombre del vendedor: ");
        nombre_vendedor = scan.next();
        System.out.println("Ingrese la cantidad de autos vendidos: ");
        autos_vendidos = scan.nextInt();
        System.out.println("Ingrese el monto total de la venta del mes: ");
        total_venta = scan.nextDouble();
        
        sueldo_total = 800 + 170 * autos_vendidos + 0.05 * total_venta;
        System.out.println("Nombre del empleado: " + nombre_vendedor);
        System.out.println("Salario de este mes: $" + formato.format(sueldo_total));
        
    }
}
