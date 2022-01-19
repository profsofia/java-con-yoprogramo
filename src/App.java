public class App {
    public static void main(String[] args) throws Exception {
        method_of_no_return("Sofi");
        System.out.println("Encontremos el mínimo entre dos números: " + min_max(5,9));
    }
    public static int min_max(int a, int b) {
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
    /**
     * La sobrecarga en Java es la capacidad de definir más de un método con el mismo nombre en una clase.
     * Acá veremos un método que tiene el mismo nombre que min, pero difiere en el tipo de parámetros.
     */
    public static double min_max(double n1, double n2) {
        double maximum;
        if(n1>n2) 
           maximum =n1;
        else
           maximum=n2;
        return maximum;
    }
}

