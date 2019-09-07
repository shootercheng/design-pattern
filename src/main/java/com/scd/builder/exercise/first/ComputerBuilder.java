package com.scd.builder.exercise.first;

/**
 * @author chengdu
 * @date 2019/9/7.
 */
public abstract class ComputerBuilder {

    private Computer computer = new Computer();

    public abstract ComputerBuilder buildCpu();

    public abstract ComputerBuilder buildMemory();

    public abstract ComputerBuilder buildHardDisk();

    public abstract ComputerBuilder buildHostMachine();

    public abstract ComputerBuilder buildMonitor();

    public Computer getComputer(){
        return computer;
    }

    public boolean existsMonitor(){
        return true;
    }
}
