package com.inheritanceTest;

public class Ecommerce {

    static class Product {
        protected int productId;
        protected String name;
        protected double price;
        protected int stockQuantity;
        protected String category;

        public Product(int productId, String name, double price,
                       int stockQuantity, String category) {

            this.productId = productId;
            this.name = name;
            this.price = price;
            this.stockQuantity = stockQuantity;
            this.category = category;
        }

        public void display() {
            System.out.println(productId);
            System.out.println(name);
            System.out.println(price);
            System.out.println(stockQuantity);
            System.out.println(category);
        }
    }

    static class ElectronicProduct extends Product {

        public ElectronicProduct(int productId, String name,
                                 double price, int stockQuantity,
                                 String category) {

            super(productId, name, price, stockQuantity, category);
        }
    }

    public static void main(String[] args) {

        ElectronicProduct product =
                new ElectronicProduct(101, "Laptop", 55000, 20, "Electronics");

        product.display();
    }
}