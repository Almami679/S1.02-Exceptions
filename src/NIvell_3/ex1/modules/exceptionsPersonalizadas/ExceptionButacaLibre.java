package NIvell_3.ex1.modules.exceptionsPersonalizadas;

public class ExceptionButacaLibre extends Exception{

    public ExceptionButacaLibre(){}

    @Override
    public String getMessage() {

        return ("Error, La butaca esta Libre");
    }
}

