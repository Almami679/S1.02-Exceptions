package NIvell_3.ex1.modules.exceptionsPersonalizadas;

import java.util.InputMismatchException;

public class ExceptionFormatoErroneo extends InputMismatchException {

    public ExceptionFormatoErroneo(String msg){

        super(msg);
    }


}
