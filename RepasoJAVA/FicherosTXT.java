package RepasoJAVA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FicherosTXT {
    public static void main(String[] args) {
        String fichero = "C:\\Users\\ALUMNO\\Documents\\AccesoADatos\\Projects\\Basicas\\src\\contenido.txt";

        try {
            FileReader fileReader = new FileReader(fichero);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null){
                System.out.println(linea);
            }
        }

        catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
}
