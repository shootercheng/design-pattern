package com.scd.factory.factorymethod2.exercise4;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class GifReader implements ImageReader {
    @Override
    public String readerInfo() {
        return "I am GifReader";
    }

    @Override
    public String readerImage() {
        return "Read Gif Image";
    }
}
