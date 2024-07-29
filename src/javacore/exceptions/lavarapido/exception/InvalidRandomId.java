package javacore.exceptions.lavarapido.exception;

/**
 * Exception When the random id generated is negative
 */
public class InvalidRandomId extends Exception{
    public InvalidRandomId(String message){
        super(message);
    }
}
