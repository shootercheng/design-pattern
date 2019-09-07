package com.scd.factory.factorymethod2.exercise4;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class JpgReader implements ImageReader {
    @Override
    public String readerInfo() {
        return "I am JpgReader";
    }

    @Override
    public String readerImage() {
        return "Read Jpg Image";
    }
}
