package storesystem;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> stock;
    private double ingresosTienda;

    public Tienda() {
        this.ingresosTienda = 2000.00;
        this.stock = new ArrayList<>();
        stock.add(new ProductoConcreto("Mesa de oficina", 445.73));
        stock.add(new ProductoConcreto("Armario de dormitorio", 2230.12));
        stock.add(new ProductoConcreto("Silla de oficina", 241.88));
        stock.add(new ProductoConcreto("Lámpara de escritorio", 89.25));


    }

    //Este método deberá añadir un nuevo elemento a stock (tabla de Productos), dicho elemento será el
    //que se le pasa como parámetro. El elemento se añadirá al final de la tabla (esto produce una
    //ampliación del número de elementos de la tabla).
    //Además dentro de este método se actualizará el valor del atributo ingresosTienda, restando a este
    //valor el precio del nuevo producto que añadamos a la tabla.

    /**
     * @param newArt
     */

    public void anadir(Producto newArt) {
        stock.add(newArt);
        ingresosTienda = ingresosTienda - newArt.getPrecio();
    }

    //Este método deberá buscar dentro de la tabla de productos, stock, el producto cuyo nombre coincida
    //con el parámetro clave usado en su llamada.
    //Este método devolverá:
    //Si no encuentra el producto: -1 .
    //Si encuentra el producto: el valor del índice donde se encuentra dicho producto.

    public int buscar(String clave) {
        for (int i = 0; i < stock.size(); i++) {
            if (stock.get(i).getNomArt().equalsIgnoreCase(clave)) {
                return i;
            }
        }
        return -1;
    }

    //Este método deberá eliminar un elemento de stock (tabla de Productos), dicho elemento será el que
    //coincida con el nombre que se le pase como parámetro. Tras eliminar este elemento, la tabla stock
    //se tendrá que redimensionar.
    //Además dentro de este método se actualizará el valor del atributo ingresosTienda, sumando a este
    //valor el precio del producto que hemos eliminado de la tabla.
    //Finalmente este método sacará el siguiente mensaje: "El Producto: nombreProductoEliminado
    //ha sido vendido"

    public Producto eliminar(String nombre) {
        int index = buscar(nombre);
        if (index != -1) {
            Producto eliminado = stock.remove(index);
            ingresosTienda = ingresosTienda + eliminado.getPrecio();
            System.out.println("El producto : " + eliminado.getNomArt() + " ha sido vendido");
            return eliminado;
        } else {
            System.out.println("Producto no encontrado");
            return null;
        }
    }

    //Este método devolverá el precio del elemento de la tabla stock que coincida con el nombre que se le
    //pasa como parámetro

    public double getPrecio(String nombre) {
        int index = buscar(nombre);
        if (index != -1) {
            return stock.get(index).getPrecio();
        }
        return 0.0;
    }

    public double getDinero() {
        return ingresosTienda;
    }

    //sobreescribir el metodo toString


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nEn el inventario de productos es el siguiente: \n");
        for (Producto p : this.stock) {
            sb.append("Nombre del producto: ").append(p.getNomArt()).append("\n");
            sb.append("Precio: ").append(p.getPrecio()).append("\n");
        }
        sb.append("!Esos son los unicos productos que nos quedan");
        return sb.toString();

    }
}
