public class Arrays{
    /*
    Arrays unidimensionales (vectores)
    En Java se declaran especificando el tipo de dato que almacenarán, el nombre y la identificación []
    */
    int succession[] = new int[5];
    succession[0]= 0;
    succession[1]= 3;
    succession[2]= 6;
    succession[3]= 9;
    succession[4]= 12;
    for(int i=0; i<succession.length; i++){
        //Recorremos el arreglo en sentido creciente
        System.out.println("La posición del Array es: " + i);
        System.out.println("El contendo es: " + succession[i]);
    }

}