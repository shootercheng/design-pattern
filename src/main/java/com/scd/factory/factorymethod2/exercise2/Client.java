package com.scd.factory.factorymethod2.exercise2;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class Client {

    public static void main(String[] args){
        Diagram bendingDiagram = new BendingDiagramFactory().createDiagram();
        System.out.println(bendingDiagram.info());
    }
}
