package storesystem;

public abstract class Producto {

    protected String nomArt;
    protected double precio;

    public Producto(String nomArt, double precio) {
        this.nomArt = nomArt;
        this.precio = precio;
    }

    public String getNomArt() {
        return nomArt;
    }

    public double getPrecio() {
        return precio;
    }
}
