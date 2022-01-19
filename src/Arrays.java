public class Arrays {

 public static void $array(int[] args){
    int array[][] = new int[3][3];
    //El primer valor entre corchetes pertenece a las filas y el segundo a las columnas.
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
      //filas
        for(int a=0; a<3; a++){
            //columnas
            for(int b=0; b<3; b++){
            System.out.println("Estoy en la fila " + a + " y la columna "+ b);
            System.out.println("Cuyos valores son: " + array[a][b]);
            }
        }
 }

}
