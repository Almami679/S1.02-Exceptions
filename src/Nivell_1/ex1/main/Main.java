package Nivell_1.ex1.main;

import Nivell_1.ex1.modules.Producto;
import Nivell_1.ex1.modules.Venta;
import Nivell_1.ex1.modules.VentaVaciaException;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws VentaVaciaException {

        int opcion = -1;
        String nombre = "";
        double precio = 0;

        Scanner input = new Scanner(System.in);
        Venta carro = new Venta();

        while (opcion != 0) {                                                        //
            System.out.println("-----------------------------------------------------\n"
                    + "-------------------LISTA DE LA COMPRA----------------\n"
                    + "-----------------------------------------------------\n"
                    + "[1]Añadir Producto   		[2]Ver Precio total\n"
                    + "[3]Consultar Lista		    [4]Salir\n");

            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escribe el nombre del producto");
                    input.next();
                    nombre = input.nextLine();
                    System.out.println("Escribe el precio");
                    precio = input.nextInt();
                    carro.addProducto(nombre, precio);
                    break;
                case 2:
                    try {
                        carro.calcularVenta();
                        if (carro.getPrecioTotalVenta() != 0) {
                            System.out.println("EL precio actual del carro es " + carro.getPrecioTotalVenta()
                                    + " €");
                        }
                    } catch (VentaVaciaException e) {
                        System.out.println("Carro vacio");
                    }
                    break;
                case 3:
                    try {
                        carro.calcularVenta();
                        if (carro.getPrecioTotalVenta() != 0) {
                            for (Producto producto : carro.getProductos()) {
                                System.out.println(" - " + producto.toString());
                            }
                        }
                    } catch (VentaVaciaException e) {
                        System.out.println("Carro vacio");
                    }
                    break;
                case 4:
                    System.out.println("bye!");
                    opcion = 0;
                    break;
                default:
                    System.out.println("Opcion fuera de rango");
            }

        }
    }
}