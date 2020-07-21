package com.crazy.java006.product;

public class TestAnonymous {
    public void test(Product product) {
        System.out.println(" buy a " + product.getName() + ", costs " + product.getPrice());
    }

    public static void main(String[] args) {
        TestAnonymous anonymous = new TestAnonymous();
        // 调用test方法时，需要传入一个 Product 参数，此处传入其匿名内部类实例
        anonymous.test(new Product() {
            @Override
            public double getPrice() {
                return 100.0;
            }

            @Override
            public String getName() {
                return "mobile";
            }
        });

        System.out.println("\n");

        class AnonymousProduct implements Product {
            @Override
            public double getPrice() {
                return 1000.0;
            }

            @Override
            public String getName() {
                return "mobile";
            }
        }

        anonymous.test(new AnonymousProduct());
    }
}
