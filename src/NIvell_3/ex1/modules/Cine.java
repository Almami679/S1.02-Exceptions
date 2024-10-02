package NIvell_3.ex1.modules;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cine {

    private int numFilas;
    private int numButacasXFila;
    private GestionButaca gestionButacas;
    private GestionCine gestionCine;

    public Cine() {
        gestionCine = new GestionCine();
        gestionButacas = new GestionButaca();
        pedirDatosInicales();

    }

    public int getNumFilas() {
        return this.numFilas;
    }

    public int getButacasXFila() {
        return this.numButacasXFila;
    }

    public void iniciar() throws Exception {
        Scanner input = new Scanner(System.in);
        int opcion = gestionCine.menu();
        int loop = 0;
        ArrayList<String> nombres = new ArrayList<>();
        if(opcion == 1) {
            System.out.println(gestionCine.mostrarButacasReservadas(gestionButacas.getButacas()));
        } else if(opcion == 2) {
            for(int persona = 0; persona <= gestionButacas.getButacas().size(); persona++ ) {
                String nombre = gestionButacas.getButacas().get(persona).getPersona();
                if(nombres.isEmpty()) {
                    nombres.add(nombre);
                    ++loop;
                    System.out.println("[" + loop + "] " + nombre);
                } else if(!nombres.contains(nombre)) {
                    nombres.add(nombre);
                    ++loop;
                    System.out.println("[" + loop + "] " + nombre);
                }
            }
            try {
                System.out.println("De que persona quieres ver las reservas?");
                while (input.hasNext()) {
//////////////////////////////////////////////////////////////////// voy por aqui!!!!!!!!!!!!!
                    if (input.nextInt() > nombres.size() || input.nextInt() <0 ) {
                        respuesta = input.nextInt();
                    }
                    else {
                        System.out.println("No se ha introducido un Integer: " + input.next());
                    }
                }

            }
    }

    public void pedirDatosInicales() {
        Scanner input = new Scanner(System.in);
        try (input) {
            try {
                System.out.println("Cuantas filas tiene el cine?");
                while (input.hasNext()) {

                    if (input.hasNextInt()) {
                        this.numFilas = input.nextInt();
                    } else {
                        System.out.println("No se ha introducido un Integer: " + input.next());
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Formato de respuesta no compatible");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
            System.out.println("Cuantas butacas tiene el cine?");
            while (input.hasNext()) {

                if (input.hasNextInt()) {
                    this.numButacasXFila = input.nextInt();
                } else {
                    System.out.println("No se ha introducido un Integer: " + input.next());
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Formato de respuesta no compatible");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }



}
