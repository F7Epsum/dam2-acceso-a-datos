package RepasoJAVA;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    //Getters and Setters para dar tener información en caso de..
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Generar Objeto Producto
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //toString para poder mostrar el producto con sus datos en la lista:
    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' +
                ", Precio=" + precio +
                ", Cantidad=" + cantidad +
                '}' + '\n';
    }
    public double precioProducto(){
        return precio*cantidad;
    }
}

