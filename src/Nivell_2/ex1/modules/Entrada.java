package Nivell_2.ex1.modules;

import java.util.Scanner;

public class Entrada extends Exception{

    private final static String message = "Formato de respuesta erroneo o no compatible";

    public Entrada() {
        super(message);
    }
}
