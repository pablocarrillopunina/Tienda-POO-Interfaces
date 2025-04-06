package storesystem;

public class Comprador extends Persona implements Comerciar {
    private final String dni;
    private double saldo;

    public Comprador(String nombre, int edad, String dni) {
        super(nombre, edad);
        this.dni = dni;
        this.saldo = 1000.00;


    }

    @Override
    public void transaction(String articulo, Tienda obj) {
        //eliminamos el producto de la tienda

        Producto productoComprado = obj.eliminar(articulo);
        if (productoComprado != null) {
            //actualizamo el saldo del comprador
            this.saldo = this.saldo - productoComprado.getPrecio();
            System.out.println("Producto comprado correctamente");
        } else {
            System.out.println("No se pudo realizar la compra, producto no encontrado");
        }

    }

    @Override
    public String saludar() {
        return "Buenos dias, esoty buscando un articulo ... \n";
    }

    @Override
    public String toString() {
        return "Los datos del comprador son: \n" +
                "Nombre del comprador: " + nombre + "\n" +
                "Edad del comprador: " + edad + "\n" +
                "DNI comprador " + dni + "\n" +
                "saldo del comprador " + saldo + "\n ";
    }

    public void devolverDinero(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }
}
