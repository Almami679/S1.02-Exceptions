package NIvell_3.ex1.modules.exceptionsPersonalizadas;

public class ExceptionFilaFueraDeRango extends Exception{

    public ExceptionFilaFueraDeRango(){}

    public String getMessage(){
        return ("Error, el numero de fila no corresponde a la sala");
    }
}
