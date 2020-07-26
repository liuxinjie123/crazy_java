package com.crazy.java006.abstr;

public class TestBaseDao {
    public static void main(String[] args) {
        OrderDao orderDao = new OrderDao();
        orderDao.test01();
        orderDao.findById();

        System.out.println("\n");

        UserDao userDao = new UserDao();
        userDao.test01();
        userDao.findById();

        System.out.println("\n");

        BaseDao baseDao = new OrderDao();
        baseDao.findById();
        baseDao = new UserDao();
        baseDao.findById();

        int i=0;
        while (i < 100) {
            i++;
            if (i % 9 == 0) continue;
            if (i == 70) break;
            System.out.printf("i=" + i + "\t");

        }

        label1:for (int m=0; m<10; m++) {
            for (int n=0; n<6; n++) {
                if (n == 20) continue label1;
                System.out.println("m=" + m + ", n=" + n);
            }
        }
    }
}
