package ejer8;

public class Alumno {

    private String nombre;
    private String edad;
    private String grado;
    private String nota;

    public Alumno(String nombre, String edad, String grado, String nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        System.out.println("Nombre Alumno" + nombre + '\n' +
                ", edad: " + edad + '\n' +
                ", grado: " + grado + '\n' +
                ", nota='" + nota);
        return "";
    }
}
