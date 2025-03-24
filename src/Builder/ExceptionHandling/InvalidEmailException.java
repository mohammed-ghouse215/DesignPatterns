package Builder.ExceptionHandling;

public class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}
