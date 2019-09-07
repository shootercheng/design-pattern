package com.scd.builder.exercise.first;

/**
 * @author chengdu
 * @date 2019/9/7.
 */
public class ComputerDirector {

    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public Computer build(){
        computerBuilder.buildCpu().buildMemory().buildHardDisk().buildHostMachine();
        if (computerBuilder.existsMonitor()){
            computerBuilder.buildMonitor();
        }
        return computerBuilder.getComputer();
    }
}
