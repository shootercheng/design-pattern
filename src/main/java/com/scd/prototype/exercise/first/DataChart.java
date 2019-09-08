package com.scd.prototype.exercise.first;

import com.scd.prototype.deep.WeeklyLog;

import java.io.*;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class DataChart implements Serializable {

    private String no;

    private DataSet dataSet;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public DataSet getDataSet() {
        return dataSet;
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public DataChart(String no, DataSet dataSet) {
        this.no = no;
        this.dataSet = dataSet;
    }

    public DataChart deepClone(){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return (DataChart) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "DataChart{" +
                "no='" + no + '\'' +
                ", dataSet=" + dataSet +
                '}';
    }
}
