package com.teste.frame.work.teste.errors;

public class ObjectErrorException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ObjectErrorException(String msg) {
        super(msg);
    }

    public ObjectErrorException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

