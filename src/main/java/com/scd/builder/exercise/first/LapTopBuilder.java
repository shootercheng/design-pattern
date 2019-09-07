package com.scd.builder.exercise.first;

/**
 * @author chengdu
 * @date 2019/9/7.
 */
public class LapTopBuilder extends ComputerBuilder {

    @Override
    public ComputerBuilder buildCpu() {
        Computer computer = super.getComputer();
        computer.setCpu("LapTop cpu");
        return this;
    }

    @Override
    public ComputerBuilder buildMemory() {
        Computer computer = super.getComputer();
        computer.setMemory("LapTop memory");
        return this;
    }

    @Override
    public ComputerBuilder buildHardDisk() {
        Computer computer = super.getComputer();
        computer.setHarddisk("LapTop memory");
        return this;
    }

    @Override
    public ComputerBuilder buildHostMachine() {
        Computer computer =  super.getComputer();
        computer.setHostmachine("LapTop host machine");
        return this;
    }

    @Override
    public ComputerBuilder buildMonitor() {
        Computer computer =  super.getComputer();
        computer.setMonitor("LapTop Monitor");
        return this;
    }
}
