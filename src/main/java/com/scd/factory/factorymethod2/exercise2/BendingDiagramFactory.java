package com.scd.factory.factorymethod2.exercise2;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class BendingDiagramFactory implements DiagramFactory {
    @Override
    public Diagram createDiagram() {
        return new BendingDiagram();
    }
}
