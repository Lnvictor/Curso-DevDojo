package javacore.exceptions.study;

public class NegativeBalanceException extends RuntimeException{
    public NegativeBalanceException(String message){
        super(message);
    }
}
