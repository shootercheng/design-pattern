package com.scd.singleton.exercise;

/**
 * @author chengdu
 */
public class DataPoolConn {
    private static volatile DataPoolConn dataPoolConn = null;

    private Integer connNum;

    private DataPoolConn(Integer connNum){
        this.connNum = connNum;
    }

    public boolean borrowConn(){
        if(connNum > 0){
            connNum --;
            return true;
        }
        return false;
    }

    public void closeConn(){
        connNum ++;
    }

    public static DataPoolConn getDataPoolConnInstance(int connNum){
        if(dataPoolConn == null){
            synchronized (DataPoolConn.class){
                if(dataPoolConn == null){
                    dataPoolConn = new DataPoolConn(connNum);
                }
            }
        }
        return dataPoolConn;
    }
}
