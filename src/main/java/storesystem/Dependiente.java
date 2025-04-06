package storesystem;

import java.util.Scanner;

public class Dependiente extends Persona implements Comerciar {

    private final String nuss;

    public Dependiente(String nombre, int edad, String nuss) {
        super(nombre, edad);
        this.nuss = nuss;
    }

    @Override
    public void transaction(String articulo, Tienda obj) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del producto a dovelver\n");
        double precio = sc.nextDouble();
        sc.nextLine(); //limpiamos el buffer

        //creamos un nuevo producto clase concreta
        Producto productoDevuelto = new ProductoConcreto(articulo, precio);

        //añadimos a la tienda
        obj.anadir(productoDevuelto);
        System.out.println("Producto devuelto corectamente");

    }

    @Override
    public String saludar() {
        return "Buenos dias en que puedo atenderle...\n";

    }

    @Override
    public String toString() {
        return "Nombre Dependiente" + nombre +
                "\nEdad dependiente " + edad +
                "\nNUSS dependeinte " + nuss;
    }
}
