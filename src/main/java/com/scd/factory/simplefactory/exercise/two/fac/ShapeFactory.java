package com.scd.factory.simplefactory.exercise.two.fac;

/**
 * @author chengdu
 * @date 2019/6/12.
 */
public class ShapeFactory {

    public static final String CIRCLE = "circle";
    public static final String RECTANGLE = "rectangle";
    public static final String Triangle = "triangle";

    public static Shape createShape(String type){
        Shape shape;
        if(CIRCLE.equals(type)){
            shape = new Circle();
        }else if(RECTANGLE.equals(type)){
            shape = new Rectangle();
        }else if(Triangle.equals(type)){
            shape = new Rectangle();
        }else{
            throw new UnsupportedOperationException("unsupported type " + type);
        }
        return shape;
    }

    public static void main(String[] args){
        Shape shape = createShape(CIRCLE);
        shape.draw();
        shape.erase();
    }
}
