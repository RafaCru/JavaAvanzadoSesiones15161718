package procesamientoerrores.noencontrado;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream fileInputStream = new FileInputStream("c:/entrada/documento.txt");
        }catch (FileNotFoundException e){
            System.out.println("Revisa la carpeta c:/entrada:" +"\n"+e.getMessage());
        }
    }
}
