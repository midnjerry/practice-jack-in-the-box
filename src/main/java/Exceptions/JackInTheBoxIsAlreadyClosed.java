package Exceptions;

public class JackInTheBoxIsAlreadyClosed extends RuntimeException{
    public JackInTheBoxIsAlreadyClosed(String message) {
        super(message);
    }
}
