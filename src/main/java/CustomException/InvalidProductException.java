package CustomException;

public class InvalidProductException extends Exception
{
    public InvalidProductException(String message)
    {
        super(message);
    }
}