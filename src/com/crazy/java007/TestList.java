package com.crazy.java007;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Three Body Problem");
        list.add("The Common World");
        System.out.println(list);
        list.remove("The Common World");
        System.out.println(list);

        System.out.println("\n");

        List<Order> orderList = new ArrayList<>();
        Order order = new Order();
        order.setContent("电子产品订单");
        orderList.add(order);
        order = new Order();
        order.setContent("生鲜订单");
        orderList.add(order);
        System.out.println(orderList);

//        for (Order o : orderList) {
//            if ("生鲜订单".equals(o.getContent())) {
//                orderList.remove(o);
//            }
//        }
        Iterator iterator = orderList.iterator();
        while (iterator.hasNext()) {
            Order o = (Order) iterator.next();
            if ("生鲜订单".equals(o.getContent())) {
//                orderList.remove(o)
                iterator.remove();
            }
        }
        System.out.println(orderList);
    }
}
