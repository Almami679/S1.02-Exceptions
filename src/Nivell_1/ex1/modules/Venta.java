package Nivell_1.ex1.modules;

import Nivell_1.ex1.modules.VentaVaciaException;
import java.util.ArrayList;

public class Venta {

    private ArrayList<Producto> productos;
    private double precioTotalVenta;

    public Venta() {
        this.productos = new ArrayList<>();
        this.precioTotalVenta = 0;
    }
    //GETTERS
    public double getPrecioTotalVenta() {
        return this.precioTotalVenta;
    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    //SETTERS

    public void addProducto(String nombre, double precio) {
        this.productos.add(new Producto(nombre, precio));
    }

    public void setPrecioTotalVenta(double precioTotalVenta) {
        this.precioTotalVenta = precioTotalVenta;
    }

    public void calcularVenta() throws VentaVaciaException {
            if(this.productos.isEmpty()) {
                throw new VentaVaciaException();

            } else{
                for (int producto = 1; producto <= this.productos.size(); producto++) {
                    setPrecioTotalVenta(this.precioTotalVenta += this.productos.get(producto).getPrecio());}

        }

    }
}
