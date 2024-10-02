package NIvell_3.ex1.modules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GestionCine {

    private Cine cine;

    public GestionCine(Cine cine) {
        this.cine = cine;
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
/////////////////////////////// ACABAR de desarrollar /////////////////////////////////////
    public String mostrarButacasReservadas(ArrayList<Butaca> butacas) {
           StringBuilder butacasReservadas = new StringBuilder();
        for(Butaca butaca : butacas) {
            butacasReservadas.append(butaca.toString()).append("\n");
        }
        return butacasReservadas.toString();
    }


///////////////////////////////////////////////////////////////////////////////////////////

    public String mostrarButacasPersona(String persona) {
        String butacasReservadas = "";


        return butacasReservadas;
    }


//////////////////////////////////////////////////////////////////////////////////////////

    public void reservarButaca(int numFila, int numButaca, int persona) {

        introduirFila(numFila);
        introduirButaca(numButaca);
        introduirPersona(persona);

        //Reservar la butaca
    }


//////////////////////////////////////////////////////////////////////////////////////////

    public void anularReserva(int numFila, int numButaca) {

        introduirFila(numFila);
        introduirButaca(numButaca);

        //eliminar reserva
    }


/////////////////////////////////////////////////////////////////////////////////////////

    public void anularReservaPersona(String persona) {
        introduirPersona(persona);

        //eliminar todas las reservas de la persona
    }


/////////////////////////////////////////////////////////////////////////////////////7///

    public String introducirPersona(String persona) {
        List<String> numeros = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0");
        String respuesta = "";
        try {
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
        }
        return respuesta;
    }

////////////////////////////////////////////////////////////////////////////////////////////

    public int introducirNumFila(int numFila) {
        int respuesta = 0;
        try {
            if(numFila > this.cine.getNumFilas() || numFila <= 0) {
                System.out.println("ExcepcionFilaIncorrecta");
            } else {
                respuesta = numFila;
            }
        } catch(Exception e){
            System.out.println("Error inesperado: " + e.getMessage());
        }
        return respuesta;
    }

////////////////////////////////////////////////////////////////////////////////////////////////

    public int introducirNumButaca(int numButaca) {
        int respuesta = 0;
        try {
            if(numButaca > this.cine.getButacasXFila() || numButaca <= 0) {
                System.out.println("ExcepcionAsientoIncorrecto");
            } else {
                respuesta = numButaca;
            }
        } catch(Exception e){
            System.out.println("Error inesperado: " + e.getMessage());
        }
        return respuesta;
    }
}
