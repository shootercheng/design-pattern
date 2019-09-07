package com.scd.factory.abstractfactory;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public abstract class SkinFactory {
    public abstract Button createButton();
    public abstract TextField createTextField();
    public abstract ComboBox createComboBox();
}
