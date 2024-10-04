package NIvell_3.ex1.modules.exceptionsPersonalizadas;

public class ExceptionNombreErroneo extends Exception{

    public ExceptionNombreErroneo(){}

    @Override
    public String getMessage() {

        return ("Error, Formato de nombre no compatible");
    }
}
