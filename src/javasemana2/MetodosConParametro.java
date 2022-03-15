
package javasemana2;


public class MetodosConParametro {
    public static void main(String[] args) {
    metodosconparametroVoid(10,3.0,"hola");  
     metodosconparametroInt(2);
      metodosconparametroDuble(12.9);
       metodosconparametroString("a");
}

    private static void metodosconparametroVoid(int i, double d, String hola) {
       System.out.println("valor int :" +i);
       System.out.println("valor double :"+d);
       System.out.println("valor string :" +hola);
}
    private static int metodosconparametroInt(int i) {
        
      System.out.println("el valor int :" +i);
        return 0;
            }

    private static double metodosconparametroDuble(double d) {
       System.out.println(" el valor double es :" + d);
       return 0.0;
    }

    private static String metodosconparametroString(String a) {
       System.out.println("el valor string es :"+a);
        return "";
       
    }
}
