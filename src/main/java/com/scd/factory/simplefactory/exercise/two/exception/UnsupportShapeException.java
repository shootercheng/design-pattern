package com.scd.factory.simplefactory.exercise.two.exception;

/**
 * @author chengdu
 */
public class UnsupportShapeException extends RuntimeException{

    public UnsupportShapeException(){
        super();
    }

    public UnsupportShapeException(String msg){
        super(msg);
    }
}
