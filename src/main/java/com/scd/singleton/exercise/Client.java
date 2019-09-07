package com.scd.singleton.exercise;

/**
 * @author chengdu
 */
public class Client {

    public static void main(String[] args){
        LoadBalancer loadBalancer1,loadBalancer2,loadBalancer3;
        loadBalancer1 = LoadBalancer.getLoadBalancer();
        loadBalancer2 = LoadBalancer.getLoadBalancer();
        loadBalancer3 = LoadBalancer.getLoadBalancer();
        if(loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3){
            System.out.println("singleton okay");
        }
        loadBalancer1.addServer("Server1");
        loadBalancer2.addServer("Server2");
        loadBalancer3.addServer("Server3");
        loadBalancer1.addServer("Server4");

        for(int i=0; i < 10; i++){
            String server = loadBalancer1.getServer();
            System.out.println("分发请求的服务器是: "+server);
        }
    }
}
