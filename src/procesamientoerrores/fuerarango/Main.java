package procesamientoerrores.fuerarango;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        int posicion = 0;
        try{
            String[] array={"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete"};
            for (String valor:array){
                System.out.println("El valor de la posición "+ posicion + " "+ valor);
                posicion++;
                System.out.println(array[posicion]);
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error "+ e.getMessage());
        }

    }
}
