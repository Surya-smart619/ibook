package com.ideas2it.ibook.util;

public class IBookException extends Exception {

    public IBookException(String message) {
       super(message);
    }

    public IBookException(String message, Throwable cause) {
       super(message, cause);
    }
}

