package com.scd.builder.exercise.first;

/**
 * @author chengdu
 * @date 2019/9/7.
 */
public class Computer {

    private String cpu;

    private String memory;

    private String harddisk;

    private String hostmachine;

    private String monitor;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }

    public String getHostmachine() {
        return hostmachine;
    }

    public void setHostmachine(String hostmachine) {
        this.hostmachine = hostmachine;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", harddisk='" + harddisk + '\'' +
                ", hostmachine='" + hostmachine + '\'' +
                ", monitor='" + monitor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;

        Computer computer = (Computer) o;

        if (getCpu() != null ? !getCpu().equals(computer.getCpu()) : computer.getCpu() != null) return false;
        if (getMemory() != null ? !getMemory().equals(computer.getMemory()) : computer.getMemory() != null)
            return false;
        if (getHarddisk() != null ? !getHarddisk().equals(computer.getHarddisk()) : computer.getHarddisk() != null)
            return false;
        if (getHostmachine() != null ? !getHostmachine().equals(computer.getHostmachine()) : computer.getHostmachine() != null)
            return false;
        return getMonitor() != null ? getMonitor().equals(computer.getMonitor()) : computer.getMonitor() == null;
    }

    @Override
    public int hashCode() {
        int result = getCpu() != null ? getCpu().hashCode() : 0;
        result = 31 * result + (getMemory() != null ? getMemory().hashCode() : 0);
        result = 31 * result + (getHarddisk() != null ? getHarddisk().hashCode() : 0);
        result = 31 * result + (getHostmachine() != null ? getHostmachine().hashCode() : 0);
        result = 31 * result + (getMonitor() != null ? getMonitor().hashCode() : 0);
        return result;
    }
}
