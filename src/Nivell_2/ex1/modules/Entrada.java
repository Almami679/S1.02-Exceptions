package Nivell_2.ex1.modules;

import java.util.Scanner;
import java.util.InputMismatchException;




public class Entrada {

    
    ////////////////////////////////////////////////////////////////////////
    public static byte llegirByte(String missatge) throws InputMismatchException {
        byte respuesta = 0;
        Scanner input = new Scanner(System.in);
        try{
            System.out.println(missatge);
            while (input.hasNext()) { 
                
            if (input.hasNextByte()) {
                respuesta = input.nextByte();
            } 
            else {
                System.out.println("No se ha introducido un byte: " + input.next()); 
            } 
        } 
    } catch(InputMismatchException e) {
        System.out.println("Formato de respuesta no compatible");
    } catch(Exception e){
        System.out.println("Error inesperado: " + e.getMessage());
    }finally{
        input.close();
    }
    return respuesta;
    }
    
    ////////////////////////////////////////////////////////////////////////
    
    public static int llegirInt(String missatge) throws InputMismatchException {
        int respuesta = 0;
        Scanner input = new Scanner(System.in);
        try{
            System.out.println(missatge);
            while (input.hasNext()) { 
                
            if (input.hasNextInt()) {
                respuesta = input.nextInt();
            } 
            else {
                System.out.println("No se ha introducido un Integer: " + input.next()); 
            } 
        } 
    } catch(InputMismatchException e) {
        System.out.println("Formato de respuesta no compatible");
    } catch(Exception e){
        System.out.println("Error inesperado: " + e.getMessage());
    }finally{
        input.close();
    }
    return respuesta;
    }
    
    ////////////////////////////////////////////////////////////////////////
    
    public static float llegirFloat(String missatge) throws InputMismatchException {
    	float respuesta = 0;
        Scanner input = new Scanner(System.in);
        try{
            System.out.println(missatge);
            while (input.hasNext()) { 
                
            if (input.hasNextFloat()) {
                respuesta = input.nextFloat();
            } 
            else {
                System.out.println("No se ha introducido un float: " + input.next()); 
            } 
        } 
    } catch(InputMismatchException e) {
        System.out.println("Formato de respuesta no compatible");
    } catch(Exception e){
        System.out.println("Error inesperado: " + e.getMessage());
    }finally{
        input.close();
    }
    return respuesta;
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////
    
    public static double llegirDouble(String missatge) throws InputMismatchException {
        double respuesta = 0;
        Scanner input = new Scanner(System.in);
        try{
            System.out.println(missatge);
            while (input.hasNext()) { 
                
            if (input.hasNextDouble()) {
                respuesta = input.nextDouble();
            } 
            else {
                System.out.println("No se ha introducido un double: " + input.next()); 
            } 
        } 
    } catch(InputMismatchException e) {
        System.out.println("Formato de respuesta no compatible");
    } catch(Exception e){
        System.out.println("Error inesperado: " + e.getMessage());
    }finally{
        input.close();
    }
    return respuesta;
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////
 // Mètodes a implantar capturant una excepció personalitzada de la classe Exception:

    public static char llegirChar(String missatge) throws Exception {
        char respuesta = ' ';//todas las char vacias se ponen en espacio blanco entre comillas simples
        Scanner input = new Scanner(System.in);
        try{
            System.out.println(missatge);
            while (input.hasNext()) { 
                
            if (input.next().length() == 1) {
                respuesta = charAt(input.nextLine()); //////////////////////ARREGLAR ESTO MAÑANA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            } 
            else {
                System.out.println("No se ha introducido un caracter: " + input.next()); 
            } 
        } 
    } catch(Exception e){
        System.out.println("Error inesperado: " + e.getMessage());
    }finally{
        input.close();
    }
    return respuesta;
    }

    public static String llegirString(String missatge) throws Exception {
        String respuesta = "";
        Scanner input = new Scanner(System.in); 
        try{
            System.out.println(missatge);
            while (input.hasNext()) { 
                
            if (!input.hasNextInt() || !input.hasNextByte() || !input.hasNextDouble() || !input.hasNextFloat()) {
                respuesta = input.next();
            } 
            else {
                System.out.println("No se ha introducido un Palabra: " + input.next()); 
            } 
        } 
    } catch(Exception e){
        System.out.println("Error inesperado: " + e.getMessage());
    }finally{
        input.close();
    }
    return respuesta;
    }

    public static boolean llegirSiNo(String missatge) throws Exception {
        boolean respuesta = false;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println(missatge);
            while (input.hasNext()) {

                if (input.nextLine().equalsIgnoreCase("s")) {
                    respuesta = true;
                } else if (input.nextLine().equalsIgnoreCase("n")) {
                    respuesta = false;
                }
            }
        } catch(Exception e){
            System.out.println("Error inesperado: " + e.getMessage());
        }finally{
            input.close();
        }
            return respuesta;

    }
            
}
