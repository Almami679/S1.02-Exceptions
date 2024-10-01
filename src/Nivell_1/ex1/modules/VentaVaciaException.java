package Nivell_1.ex1.modules;

public class VentaVaciaException extends Exception{

    private final static String message = "Para hacer una venta antes debes añadir productos";

    public VentaVaciaException() {
        super(message);
    }

}
