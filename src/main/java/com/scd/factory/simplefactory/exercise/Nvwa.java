package com.scd.factory.simplefactory.exercise;

/**
 * @author chengdu
 * @date 2019/6/12.
 */
public class Nvwa {

    public static final String MAN = "man";
    public static final String WOMAN = "woman";
    public static final String ROBOT = "robot";

    public static Person createPerson(String type) throws Exception {
        Person person;
        if(MAN.equals(type)){
            person = new Man();
        }else if(WOMAN.equals(type)){
            person = new Woman();
        }else if(ROBOT.equals(type)){
            person = new Robot();
        }else{
            throw new Exception("this type person not find");
        }
        return person;
    }

    public static void main(String[] args) throws Exception {
        Person person = createPerson(ROBOT);
        Person person1 = createPerson(ROBOT);
        System.out.println(person == person1);
        person.showType();
    }
}
