package com.scd.factory.abstractfactory;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class SummerSkinFactory extends SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
