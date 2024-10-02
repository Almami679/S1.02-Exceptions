package NIvell_3.ex1.modules;

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

    public static void añadirButaca(Butaca butaca) {
        try {
            if(buscarButaca(butaca.getNumFila(), butaca.getNumAsiento()) != -1) {
                System.out.println("ExcepcionButacaOcupada");
            } else {
                getButacas().add(butaca);
            }
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }



    //////////////////////////////////////////////////////////////

    public static void eliminarButaca(int numFila, int numButaca) {

        if (buscarButaca(numFila, numButaca) == -1) {
            System.out.println("ExcepcioButacaLliure");
        } else {
            butacas.remove(buscarButaca(numFila, numButaca));
        }
    }


///////////////////////////////////////////////////////////////////7

    public static int buscarButaca(int numFila, int numButaca) {
        int respuesta = -1;
        for(int b = 0; b <= butacas.size(); b++) {
            if (butacas.get(b).getNumFila() == numFila && butacas.get(b).getNumAsiento() == numButaca) {
                respuesta = b;
            }
        }
        return respuesta;
    }
}
