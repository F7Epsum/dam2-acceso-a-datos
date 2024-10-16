package ejer11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TrabajandoConFicheros {
    public static void main(String[] args) {

        File archivo = new File("src/alumnos.txt");

        if (isExists(archivo)){
              long bits = getBits(archivo.length());

            FileInputStream fis = null;
            try {
                fis = new FileInputStream("src/alumnos.txt");

                int byteLeido;
                while ((byteLeido = fis.read()) != -1){
                    System.out.println((char) byteLeido);
                }
            }
            catch (IOException e){
                System.out.println("Error: " + e);
            }
        }
    }

    public static void leerArchivoYObtenerTamano(){
        FileInputStream fis = null;

        try {
            File archivo = new File("src/alumnos.txt");

            if (isExists(archivo)){
                fis = new FileInputStream(archivo);
                long sizeFile = archivo.length();
                byte[] contenido = new byte[(int) sizeFile];

                fis.read(contenido);
                System.out.println(new String(contenido));
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e);
        }
    }


    public static boolean isExists(File archivo){
        return archivo.exists();
    }

    public static long getBits(long archivoLength){
        return archivoLength *8;
    }


}
