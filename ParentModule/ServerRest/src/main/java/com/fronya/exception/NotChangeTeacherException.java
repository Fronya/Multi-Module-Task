package com.fronya.exception;

/**
 * If server can't update teacher
 */
public class NotChangeTeacherException extends Exception {

    /**
     * Constructor of exception
     */
    public NotChangeTeacherException(){
        super("Can't update duration.");
    }
}
