package com.scd.factory.factorymethod2.exercise4;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class Client {

    public static void main(String[] args){
        ImageReader imageReader = new GifImageReaderFactory().createImageReader();
        System.out.println(imageReader.readerInfo());
        System.out.println(imageReader.readerImage());
    }
}
