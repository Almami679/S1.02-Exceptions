package NIvell_3.ex1.modules.exceptionsPersonalizadas;

public class ExceptionButacaFueraDeRango extends Exception {

    public ExceptionButacaFueraDeRango(){}

    public String getMessage() {
        return "Error, la butaca no corresponde a ninguna butaca de la sala";
    }
}
