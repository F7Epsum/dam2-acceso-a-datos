package RepasoJAVA;

import java.util.ArrayList;

public class Tienda {

    public static void main(String[] args) {

        //Añadir cantidades y productos
        ArrayList<Producto> inventario = new ArrayList<>();
        inventario.add(new Producto("Ordenador",50,3));
        inventario.add(new Producto("Monitores",90,5));
        inventario.add(new Producto("Teclados",30,8));
        inventario.add(new Producto("Mouses",10,9));

        //Mostrar todos los productos
        System.out.println(inventario);


        //Actualizar cantidad y precio de un producto.
        inventario.get(1).setCantidad(25);
        inventario.get(3).setPrecio(12);

        System.out.println(inventario);

        //Eliminar producto de inventario
        inventario.remove(3);

        System.out.println(inventario);

        //Calcular el valor total del inventario
        double total = 0;
        for (int i = 0; i < inventario.size(); i++){
//            System.out.println(inventario.get(i).precioProducto());
            total += inventario.get(i).precioProducto();
        }
        System.out.println(total);

    }
}
