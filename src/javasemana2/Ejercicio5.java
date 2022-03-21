
package JavaSemana2;

import java.util.Scanner;

/**
5-. Escriba un programa para calcular el salario bruto de un empleado. Para calcular el salario del empleado debemos de hacer
los descuentos por llegadas tardías así como la retención de la renta que es el 10% del salario menos el descuento por llegada
tardía. Debe de crear una fórmula para determinar el salario por minuto y calcular el monto por las llegadas tardías y
descontarlo al salario, luego debe de descontar el monto de la renta. El programa deberá permitir ingresar el nombre del
empleado, el salario mensual. El programa deberá de imprimir el nombre del empleado, el descuento por llegadas tardías, la
retención de la renta y finalmente el salario bruto.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
       
        String nombre;
        int numcomputadoras;
        double salario,comicionporpc,renta, salariodevengado;
        
        salario=300.00;
        comicionporpc=50.00;
        
        Scanner teclado = new Scanner(System.in);
             
        System.out.println("ingrese el nombre de el vendedor");
        nombre = teclado. nextLine();  
        System.out.println("Ingresar cantidad de PC vendidas en un mes :");
        numcomputadoras= teclado.nextInt();
        
        salariodevengado=comicionporpc*numcomputadoras+salario;
        renta=salariodevengado*0.10;     
         
         
           System.out.println("El nombre del vendedoe es  : " + nombre);
           System.out.println("El salario devengado es : " + salariodevengado);
           System.out.println("La retencion de la renta es : " + renta);
          
    }

}
