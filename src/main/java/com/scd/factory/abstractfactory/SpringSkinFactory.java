package com.scd.factory.abstractfactory;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class SpringSkinFactory extends SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
