
package JavaSemana2;

import java.util.Scanner;

public class CalcularDai {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        double valorMaquina, valorFlete, valorSeguro;
        System.out.println("Valor de la màquina");
        valorMaquina = leer.nextDouble();
        
        System.out.println("Valor del felte:");
        valorFlete = leer.nextDouble();
        
        System.out.println("Valor del Seguro");
        valorSeguro = leer.nextDouble();
        
        double valorDai = CalcularDai.obtenerDai (valorMaquina, valorFlete, valorSeguro);
        double valorConIva= CalcularDai.obtenerIva(valorDai);
        
        System.out.println("Valor del DAI: " + valorDai);
        System.out.println("Valor del IVA: " + valorConIva);
        }

    private static double obtenerDai(double valorMaquina, double valorFlete, double valorSeguro) {
        
    double dai=0;
    dai=(valorMaquina - valorFlete - valorSeguro);
    return dai ;
    }

    private static double obtenerIva(double dai) {
        double pagoConIva=0;
        pagoConIva = dai *1.13;
        return pagoConIva;
    }
    
}
