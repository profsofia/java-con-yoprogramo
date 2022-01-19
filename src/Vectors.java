import java.util.Scanner;

public class Vectors{

    public static int $vector(){
     /*
    Arrays unidimensionales (vectores)
    En Java se declaran especificando el tipo de dato que almacenarán, el nombre y la identificación []
    */
    int[] vector1 = new int[5];

    vector1[0]= 0;
    vector1[1]= 3;
    vector1[2]= 6;
    vector1[3]= 9;
    vector1[4]= 12;
    
    for(int i=0; i<vector1.length; i++){
        //Recorremos el arreglo en sentido creciente
        System.out.println("La posición del Array es: " + i);
        System.out.println("El contendo es: " + vector1[i]);
    }
    /**
     * Crearemos un array vacio para que el usuario lo llene
     * Eso lo hacemos con el método Scanner.
     */
    
     int[] vector2 = new int[7];

    try (Scanner insert_keyboard = new Scanner(System.in)) {
        for(int j=0; j<vector2.length; j++){
            //Solicitud de ingreso
            System.out.println("Inserte el número del vector para la posición " + j);
            //Se lee por teclado el valor
            int key = insert_keyboard.nextInt();
            //se asigna el valor del teclado a el vector
            vector2[j] = key ;
        }
    }
    }
    
}