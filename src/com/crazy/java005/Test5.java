package com.crazy.java005;

import com.alibaba.fastjson.JSON;
import com.crazy.java005.bird.Bird;
import com.crazy.java005.bird.Ostrich;
import com.crazy.java005.fruit.Apple;

public class Test5 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(JSON.toJSONString(person));
        person.say("Hello Java!");
        System.out.println(JSON.toJSON(person));

        Dog dog = new Dog();
        dog.run();




    }
}
