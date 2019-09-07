package com.scd.builder.exercise.first;

/**
 * @author chengdu
 * @date 2019/9/7.
 */
public class ServerHostBuilder extends ComputerBuilder {

    @Override
    public ComputerBuilder buildCpu() {
        Computer computer = super.getComputer();
        computer.setCpu("ServerHost cpu");
        return this;
    }

    @Override
    public ComputerBuilder buildMemory() {
        Computer computer = super.getComputer();
        computer.setMemory("ServerHost Memory");
        return this;
    }

    @Override
    public ComputerBuilder buildHardDisk() {
        Computer computer = super.getComputer();
        computer.setHarddisk("ServerHost hard disk");
        return this;
    }

    @Override
    public ComputerBuilder buildHostMachine() {
        Computer computer = super.getComputer();
        computer.setHostmachine("ServerHost host machine");
        return this;
    }

    @Override
    public ComputerBuilder buildMonitor() {
        Computer computer = super.getComputer();
        computer.setMonitor(null);
        return this;
    }

    public boolean existsMonitor(){
        return false;
    }
}
