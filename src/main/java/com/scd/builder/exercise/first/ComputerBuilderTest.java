package com.scd.builder.exercise.first;

/**
 * @author chengdu
 * @date 2019/9/7.
 */
public class ComputerBuilderTest {

    public static void main(String[] args){
        ComputerDirector computerDirector = new ComputerDirector(new LapTopBuilder());
        Computer computer = computerDirector.build();
        System.out.println(computer);
    }
}
