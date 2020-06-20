package com.crazy.java004;

import com.crazy.vo.PersonVo;

public class TestReferenceArray {
    public static void main(String[] args) {
        PersonVo[] students;
        students = new PersonVo[2];

        PersonVo zhang = new PersonVo();
        zhang.setName("张三");
        zhang.setAge(20);
        zhang.setHeight(1.75);

        PersonVo lee = new PersonVo();
        lee.setName("李");
        lee.setAge(27);
        lee.setHeight(1.80);

        students[0] = zhang;
        students[1] = lee;

        System.out.println("students: "
                + "student[0]=" + students[0].toString()
                + "student[1]=" + students[1].toString()
        );
        System.out.println(students[1].toString());
        System.out.println(lee.toString());
    }
}
