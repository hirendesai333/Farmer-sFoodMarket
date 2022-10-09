package CustomException;

import java.util.InputMismatchException;

public class WrongInputException extends InputMismatchException {
    public WrongInputException(String msg){
        super(msg);
    }
}
