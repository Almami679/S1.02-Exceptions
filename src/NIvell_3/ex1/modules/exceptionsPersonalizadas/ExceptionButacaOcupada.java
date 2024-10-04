package NIvell_3.ex1.modules.exceptionsPersonalizadas;

import java.io.IOException;

public class ExceptionButacaOcupada  extends Exception {

    public ExceptionButacaOcupada(){}

    @Override
    public String getMessage() {

        return ("Error, La butaca esta ocupada");
    }
}
