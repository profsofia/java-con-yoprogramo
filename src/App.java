public class App {
    public static void main(String[] args) throws Exception {
        method_of_no_return("Sofi");
        System.out.println("Encontremos el mínimo entre dos números: " + min(5,9));
    }
    public static int min(int a, int b) {
        //retorna el minimo entre dos numeros enteros
        int minimum;
        if (a>b)
          minimum=b;
        else
          minimum=a;
        return minimum;
    }
    //la palabra clave void se usa para métodos que no tienen retorno
    public static void method_of_no_return(String nombre) {
        System.out.println("Hola "+ nombre );
    }
}

