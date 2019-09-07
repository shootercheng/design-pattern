package com.scd.singleton.exercise;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chengdu
 * @date 2019/6/11.
 */
public class LoadBalancer {

    private List<String> serverList;

    private LoadBalancer(){
        serverList = new ArrayList<>();
    }

    public void addServer(String server){
        serverList.add(server);
    }

    public void removeServer(String server){
        serverList.remove(server);
    }

    public String getServer(){
        SecureRandom secureRandom = new SecureRandom();
        int index = secureRandom.nextInt(serverList.size());
        return serverList.get(index);
    }

    private static class LoadBalancerHolder{
        private static final LoadBalancer loadBalancer = new LoadBalancer();
    }

    public static LoadBalancer getLoadBalancer(){
        return LoadBalancerHolder.loadBalancer;
    }
}
