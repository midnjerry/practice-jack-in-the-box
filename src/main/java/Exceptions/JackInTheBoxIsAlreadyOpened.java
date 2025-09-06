package Exceptions;

public class JackInTheBoxIsAlreadyOpened extends RuntimeException{
    public JackInTheBoxIsAlreadyOpened (String message) {
        super(message);
    }
}
