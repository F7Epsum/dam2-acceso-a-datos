package ejer8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ImportarAlumnoMain {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        //todo
        alumnos = readFileTXT(alumnos);
        Alumno notaMasAlta = getAlumnoNotaMasAlta(alumnos);
        //end todo


        for (Alumno alumno:alumnos){
            System.out.println(alumno.toString());
        }
        System.out.println();
        System.out.println("El alumno con nota mas alta es: \n " + notaMasAlta.toString());
    }

    public static ArrayList<Alumno> readFileTXT(ArrayList<Alumno> alumnos) {
        //todo
        String fichero = "src/alumnos.txt";

        try {
            FileReader fileReader = new FileReader(fichero);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine())!= null){
                String[] contenido = linea.split(",");

                alumnos.add(new Alumno(contenido[0],contenido[1],contenido[2],contenido[3]));
            }



        //end todo

        return alumnoNotaMasAlta;

    }

}
