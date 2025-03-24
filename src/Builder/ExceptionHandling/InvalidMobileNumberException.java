package Builder.ExceptionHandling;

public class InvalidMobileNumberException extends Exception{
    public InvalidMobileNumberException(String message){
        super(message);
    }
}
