package com.scd.builder.exercise.first;

/**
 * @author chengdu
 * @date 2019/9/7.
 */
public class DeskTopComputerBuilder extends ComputerBuilder{

    @Override
    public ComputerBuilder buildCpu() {
        Computer computer = super.getComputer();
        computer.setCpu("DeskTop cpu");
        return this;
    }

    @Override
    public ComputerBuilder buildMemory() {
        Computer computer = super.getComputer();
        computer.setMemory("DeskTop memory");
        return this;
    }

    @Override
    public ComputerBuilder buildHardDisk() {
        Computer computer = super.getComputer();
        computer.setHarddisk("DeskTop harddisk");
        return this;
    }

    @Override
    public ComputerBuilder buildHostMachine() {
        Computer computer = super.getComputer();
        computer.setHostmachine("DeskTop hostmachine");
        return this;
    }

    @Override
    public ComputerBuilder buildMonitor() {
        Computer computer = super.getComputer();
        computer.setMonitor("Desktop monitor");
        return this;
    }
}
