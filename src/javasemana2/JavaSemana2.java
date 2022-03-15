
package javasemana2;


public class JavaSemana2 {

    
    public static void main(String[] args) {
         sumar();
         int z = sumar1();
                  System.out.println("");
         
         System.out.println("  el valor de z es : " + z);
         System.out.println("");
         System.out.println("" + sumar1(10,15));

    }
    
 private static void  sumar() {
      
        int a,b,resultado;
        a=10;
        b=15;
        resultado= a + b;
        System.out.println("la suma es :"+ resultado);
        
       
    }
    private static int  sumar1() {
      
        int a,b,resultado;
        a=10;
        b=15;
        resultado= a + b;
       
        return resultado;
    }

    private static int sumar1( int x, int y) {
        int suma;
        suma = x+y;
        return suma;
    
    }
    
}
