package NIvell_3.ex1.modules;

import java.util.ArrayList;

public class GestionButaca {

    private ArrayList<Butaca> butacas;

    public GestionButaca() {
        this.butacas = new ArrayList<>();
    }

    public ArrayList<Butaca> getButacas() {
        return butacas;
    }

    ////////////////////////////////////////////////////////////////

    public void añadirButaca(Butaca butaca) {
        try {
            if(buscarButaca(butaca.getNumFila(), butaca.getNumAsiento()) != -1) {
                System.out.println("ExcepcionButacaOcupada");
            } else {
                this.butacas.add(butaca);
            }
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }



    //////////////////////////////////////////////////////////////

    public void eliminarButaca(int numFila, int numButaca) {

        if (buscarButaca(numFila, numButaca) == -1) {
            System.out.println("ExcepcioButacaLliure");
        } else {
            this.butacas.remove(buscarButaca(numFila, numButaca));
        }
    }


///////////////////////////////////////////////////////////////////7

    public int buscarButaca(int numFila, int numButaca) {
        int respuesta = -1;
        for(int b = 0; b <= this.butacas.size(); b++) {
            if (butacas.get(b).getNumFila() == numFila && butacas.get(b).getNumAsiento() == numButaca) {
                respuesta = b;
            }
        }
        return respuesta;
    }
}
