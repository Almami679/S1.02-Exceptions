package Nivell_1.ex1.modules;

public class Producto {

    private String nom;
    private double precio;

    public Producto(String nom, double precio) {
        this.nom = nom;
        this.precio = precio;
    }

    //GETTERS

    public String getNom() {
        return this.nom;
    }
    public double getPrecio() {
        return this.precio;
    }

    //toString

    public String toString() {
        return this.nom + " " + this.precio + " €";
    }
}
