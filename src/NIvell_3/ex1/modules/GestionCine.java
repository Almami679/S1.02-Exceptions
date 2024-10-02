package NIvell_3.ex1.modules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GestionCine {

    private Cine cine;

    public GestionCine() {

    }

    public int menu() throws Exception {
        Scanner input = new Scanner(System.in);
        int respuesta = -1;
        while (respuesta < 0 || respuesta > 5 ) {
            try {
                System.out.println("-----------------------------------------------------------\n" +
                        "-------------------------GESTION-CINES---------------------\n" +
                        "-----------------------------------------------------------\n" +
                        "[1]Mostrar butacas reservadas     [2] Mostrar   butacas " +
                        "                                      reservadas / persona" +
                        "[3]Reservar butca                 [4] Anular reserva / butaca" +
                        "[5]Anular reservas de persona     [0] Salir");
                respuesta = input.nextInt();
            } catch (Exception e) {
                System.out.println("Formato de respuesta no valido\nCodigo de error: " + e.getMessage());
            } finally {
                input.close();
            }
        }
        return respuesta;
    }
////////////////////////////////////////////////////////////////////////////////////////////

    public String mostrarButacasReservadas(ArrayList<Butaca> butacas) {
           StringBuilder butacasReservadas = new StringBuilder();
        for(Butaca butaca : butacas) {
            butacasReservadas.append(butaca.toString()).append("\n");
        }
        return butacasReservadas.toString();
    }


///////////////////////////////////////////////////////////////////////////////////////////

    public String mostrarButacasPersona(String persona, ArrayList<Butaca> butacas) {  //He tenido que añadir el array
        StringBuilder butacasReservadas = new StringBuilder();
        for(Butaca butaca : butacas) {
            if(butaca.getPersona().equalsIgnoreCase(persona)) {
                butacasReservadas.append("- Fila: ").append(butaca.getNumFila())
                        .append(" Butaca nº: ").append(butaca.getNumAsiento()).append("\n");
            }
        }
        return butacasReservadas.toString();
    }


//////////////////////////////////////////////////////////////////////////////////////////

    public void reservarButaca(int numFila, int numButaca, String persona) {

        Butaca nuevaReserva = new Butaca(numFila, numButaca, persona);
        GestionButaca.añadirButaca(nuevaReserva);
        System.out.println(nuevaReserva.toString() + "\nReservada Correctamente");

    }


//////////////////////////////////////////////////////////////////////////////////////////

    public void anularReserva(int numFila, int numButaca) {

        for(Butaca butaca : GestionButaca.getButacas())
            if(butaca.getNumFila() == numFila && butaca.getNumAsiento() == numButaca) {
               System.out.println("Reserva: \n" + butaca.toString() + " Eliminada.");
                GestionButaca.eliminarButaca(numFila, numButaca);
            }
    }


/////////////////////////////////////////////////////////////////////////////////////////

    public void anularReservaPersona(String persona) {
        StringBuilder butacasEliminadas = new StringBuilder();
        int numFilaAEliminar = -1;
        int numButacaAEliminar = -1;
        for(Butaca butaca : GestionButaca.getButacas())
            if(butaca.getPersona().equalsIgnoreCase(persona)) {
                numFilaAEliminar = butaca.getNumFila();
                numButacaAEliminar = butaca.getNumAsiento();
                butacasEliminadas.append("Reserva: \n").append(butaca.toString()).append(" Eliminada.");
                GestionButaca.eliminarButaca(numFilaAEliminar, numButacaAEliminar);
            }
        System.out.println(butacasEliminadas);
    }


/////////////////////////////////////////////////////////////////////////////////////7///

    public String introducirPersona() {
        Scanner input = new Scanner(System.in);
        List<String> numeros = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0");
        String respuesta = "";
        try {
            System.out.println("Cual es el nombre de la persona?");
            String persona = input.nextLine();
            for(int letra = 0; letra <= persona.length(); letra++) {
                for(int numero = 0; numero <= numeros.size(); numero++) {
                    if(!Character.toString(persona.charAt(letra)).equals(numeros.get(numero))) {
                        respuesta = persona;
                    }
                    else {
                        System.out.println("ExcepcioNomPersonaIncorrecte");
                    }
                }
            }
        } catch(Exception e){
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            input.close();
        }
        return respuesta;
    }

////////////////////////////////////////////////////////////////////////////////////////////

    public int introducirNumFila() {
        Scanner input = new Scanner(System.in);
        int respuesta = 0;
        try {
            System.out.println("Que numero de fila deseas reservar?");
            int numFila = input.nextInt();
            if(numFila > this.cine.getNumFilas() || numFila <= 0) {
                System.out.println("ExcepcionFilaIncorrecta");
            } else {
                respuesta = numFila;
            }
        } catch(Exception e){
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            input.close();
        }
        return respuesta;
    }

////////////////////////////////////////////////////////////////////////////////////////////////

    public int introducirNumButaca() {
        Scanner input = new Scanner(System.in);
        int respuesta = 0;
        try {
            System.out.println("Que numero de butaca quieres?");
            int numButaca = input.nextInt();
            if(numButaca > this.cine.getButacasXFila() || numButaca <= 0) {
                System.out.println("ExcepcionAsientoIncorrecto");
            } else {
                respuesta = numButaca;
            }
        } catch(Exception e){
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            input.close();
        }
        return respuesta;
    }
}
