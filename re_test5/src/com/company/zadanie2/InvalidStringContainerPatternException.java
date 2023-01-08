package com.company.zadanie2;

public class InvalidStringContainerPatternException extends RuntimeException {

    public InvalidStringContainerPatternException (String message){
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }

    public InvalidStringContainerPatternException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidStringContainerPatternException(Throwable cause) {
        super(cause);
    }

    public InvalidStringContainerPatternException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public InvalidStringContainerPatternException() {
        super();
    }

}
