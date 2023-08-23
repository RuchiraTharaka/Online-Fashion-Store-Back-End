package com.example.demo.exceptions;

public class DataManipulatingFailureException extends RuntimeException{

    public DataManipulatingFailureException(){
        super("Data Manipulation Failure Happened.");
    }
}
