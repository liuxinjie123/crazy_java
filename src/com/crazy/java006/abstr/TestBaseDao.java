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
    }
}
