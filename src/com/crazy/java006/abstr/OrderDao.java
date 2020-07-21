package com.crazy.java006.abstr;

public class OrderDao extends BaseDao {
    @Override
    void findById() {
        System.out.println(" OrderDao.class findById() method.");
    }
}
