package com.crazy.java006.product;

public class AnonymouseInner {
    public void test(Device device) {
        System.out.println(" buy a " + device.getName() + ", consts " + device.getPrice());
    }

    public static void main(String[] args) {
        AnonymouseInner anonymouseInner = new AnonymouseInner();
        anonymouseInner.test(new Device() {
            @Override
            public double getPrice() {
                return 100.0;
            }
        });
        // 调用无参构造方法，创建Device匿名实现类对象
        Device device = new Device() {
            {
                System.out.println(" the initialization block of anonymous inner class ");
            }
            @Override
            public double getPrice() {
                return 66.6;
            }

            @Override
            public String getName() {
                return "keyboard";
            }
        };
        anonymouseInner.test(device);
    }
}
