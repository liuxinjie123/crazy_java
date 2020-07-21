package com.crazy.java006.abstr;

public class UserDao extends BaseDao {
    @Override
    void findById() {
        System.out.println(" UserDao.class findById() method.");
    }
}
