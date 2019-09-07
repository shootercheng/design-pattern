package com.scd.factory.factorymethod2.exercise4;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class JpgImageReaderFactory implements ImageReaderFactory {

    @Override
    public ImageReader createImageReader() {
        return new JpgReader();
    }
}
