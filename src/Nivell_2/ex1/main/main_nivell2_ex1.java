package Nivell_2.ex1.main;


import Nivell_2.ex1.modules.Entrada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main_nivell2_ex1 {
    public static void main(String[] args) throws Exception {
    	
    	
    	byte edad = Entrada.llegirByte("Introduce tu edad");
    	System.out.println("Edad: " + edad);
        
        int numero = Entrada.llegirInt("Introduce el numero encasillado [5]");
        System.out.println("Numero: " + numero);
        
        float altura = Entrada.llegirFloat("Introduce tu altura");
        System.out.println("Altura: " + altura);
        
        double numeroPi = Entrada.llegirDouble("Introduce el numero PI");
        System.out.println("Numero PI = " + numeroPi);
        
        char caracter = Entrada.llegirChar("Introduce un caracter");
        System.out.println("Caracter introducido: " + caracter);
        
        String palabra = Entrada.llegirString("Introduce una palabra");
        System.out.println("String introducida: " + palabra);
        
        boolean respuesta = Entrada.llegirSiNo("Estas de acuerdo?\n[S]í   [N]o");
        System.out.println("Respuesta booleana: " + respuesta);
        
      }
}
