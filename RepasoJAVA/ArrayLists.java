package RepasoJAVA;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        for (int numero: numeros){
            System.out.println(numero);
        }

        ArrayList<Character> letras = new ArrayList<>();

        letras.add('A');
        letras.add('E');
        letras.add('I');
        letras.add('O');
        letras.add('U');

        for (char letra: letras){
            System.out.println(letra);
        }

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan",25,70));
        personas.add(new Persona("Marcos",28,71));
        personas.add(new Persona("Diego",27,75));
        personas.add(new Persona("Fefe",26,79));

        for (Persona persona: personas){
            System.out.println(persona.toString());
        }

        System.out.println(personas.get(1));

        for (Persona persona: personas){
            if (persona.getNombre().equals("Diego")){
                System.out.println(persona.toString());
            }
        }

        boolean salir = false;
        int cont = 0;

        while (!salir && cont < personas.size()){
            if(personas.get(cont).getNombre().equals("Diego")){
                System.out.println(personas.get(cont).toString());
                salir = true;
            }
            cont++;
        }


    }
}
