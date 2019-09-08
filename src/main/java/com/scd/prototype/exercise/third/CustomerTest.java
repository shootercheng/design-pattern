package com.scd.prototype.exercise.third;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class CustomerTest {

    public static void main(String[] args){
        Address address = new Address("cn", "sichuan");
        Customer customer = new Customer("scd", address);
        Customer customer_clone = customer.clone();
        Customer customer_deepClone = customer.deepClone();
        System.out.println(customer == customer_clone);
        System.out.println(customer == customer_deepClone);
        // 浅克隆对象引用未复制
        System.out.println(customer.getAddress() == customer_clone.getAddress());
        System.out.println(customer.getAddress() == customer_deepClone.getAddress());
    }
}
