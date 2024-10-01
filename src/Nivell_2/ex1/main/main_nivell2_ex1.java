package Nivell_2.ex1.main;


import Nivell_2.ex1.modules.Entrada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main_nivell2_ex1 {
    public static void main(String[] args) {

        byte edad = llegirByte("Introduce tu edad");
        int numero = llegirInt("Teclea el numero que aparece en la casilla [5]");
        float medida = llegirFloat("Escribe en valor de coma flotante canto mides");
        double numPi = llegirDouble("Escribe el numero PI");
        char simbolo = llegirChar("Escribe el simbolo del Hastag");
        String palabra = llegirString("Escribe una palabra");

    }


       // Mètodes a implantar capturant l’excepció de la classe "InputMismatchException":

        public static byte llegirByte(String missatge) throws InputMismatchException {
            byte respuesta = 0;
            Scanner input = new Scanner(System.in);
            System.out.println(missatge);
            try {
                respuesta = input.nextByte();

            } catch(InputMismatchException e){
                System.out.println("Formato de respuesta no compatible");
                }
            return respuesta;
        }

        public static int llegirInt(String missatge) throws InputMismatchException {
            int respuesta = 0;
            Scanner input = new Scanner(System.in);
            System.out.println(missatge);
            try {
                respuesta = input.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Formato de respuesta no compatible");
            }
            return respuesta;
        }

        public static float llegirFloat(String missatge) throws InputMismatchException {
            float respuesta = 0;
            Scanner input = new Scanner(System.in);
            System.out.println(missatge);
            try {
                respuesta = input.nextFloat();
            } catch(InputMismatchException e) {
                System.out.println("Formato de respuesta no compatible");
            }
            return respuesta;


        }

        public static double llegirDouble(String missatge) throws InputMismatchException {
            double respuesta = 0;
            Scanner input = new Scanner(System.in);
            System.out.println(missatge);
            try {
                respuesta = input.nextDouble();
            } catch(InputMismatchException e) {
                System.out.println("Formato de respuesta no compatible");
            }
            return respuesta;
        }


        // Mètodes a implantar capturant una excepció personalitzada de la classe Exception:

        public static char llegirChar(String missatge) throws Exception {
            char respuesta = 0;
            Scanner input = new Scanner(System.in);
            System.out.println(missatge);
            try {
                respuesta = input.next();
            } catch(Exception e) {
                System.out.println("Formato de respuesta no compatible");
            }
            return respuesta;
        }

        public static String llegirString(String missatge) throws Exception {
            new List<String> numeros = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];
            String respuesta = "";
            Scanner input = new Scanner(System.in);
            System.out.println(missatge);
            try {
                respuesta = input.next();
            } catch(Exception e) {
                System.out.println("Formato de respuesta no compatible");
            }
            return respuesta;

        }

        public static boolean llegirSiNo(String missatge) throws Entrada {
            boolean respuesta = false;
            Scanner input = new Scanner(System.in);
            System.out.println(missatge);
            try {
                if (input.next().equalsIgnoreCase("s")) {
                    respuesta = true;
                } else if(input.next().equalsIgnoreCase("n")) {
                    respuesta = false;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return respuesta;
        } // si l’usuari/ària introdueix “s”, retorna
                                                           // “true”, si l’usuari/ària introdueix “n”,
                                                           // retorna “false”.

}
