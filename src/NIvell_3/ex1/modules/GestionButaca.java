package NIvell_3.ex1.modules;

import NIvell_3.ex1.modules.exceptionsPersonalizadas.ExceptionButacaLibre;
import NIvell_3.ex1.modules.exceptionsPersonalizadas.ExceptionButacaOcupada;

import java.util.ArrayList;

public class GestionButaca {

    private static ArrayList<Butaca> butacas;

    public GestionButaca() {
        butacas = new ArrayList<>();
    }

    public static ArrayList<Butaca> getButacas() {
        return butacas;
    }

    ////////////////////////////////////////////////////////////////

    public static void añadirButaca(Butaca butaca) throws ExceptionButacaOcupada{
        if(buscarButaca(butaca.getNumFila(), butaca.getNumAsiento()) == -1) {
            getButacas().add(butaca);
            System.out.println(butaca + "\nReservada Correctamente");
        } else {
            System.out.println(new ExceptionButacaOcupada().getMessage());
        }
    }



    //////////////////////////////////////////////////////////////

    public static void eliminarButaca(int numFila, int numButaca) throws ExceptionButacaLibre {
        int pos = buscarButaca(numFila, numButaca);
        if (pos != -1) {
            System.out.println("Reserva: \n" + butacas.get(pos) + " Eliminada.");
            butacas.remove(pos);;
        } else {
            System.out.println(new ExceptionButacaLibre().getMessage());
        }
    }


///////////////////////////////////////////////////////////////////7

    public static int buscarButaca(int numFila, int numButaca) {
        int b = 0;
        boolean butacaEncontrada = false;
        int respuesta = -1;
        while(b < butacas.size() || !butacaEncontrada ) {
            if (butacas.get(b).getNumFila() == numFila && butacas.get(b).getNumAsiento() == numButaca) {
                respuesta = b;
                butacaEncontrada = true;
            }
        }
        return respuesta;
    }
}
