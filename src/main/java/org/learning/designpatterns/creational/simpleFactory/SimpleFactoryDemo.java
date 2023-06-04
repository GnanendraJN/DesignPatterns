package org.learning.designpatterns.creational.simpleFactory;

public class SimpleFactoryDemo {

    public static void main(String[] args) {
        Car car = CarFactory.getCar("TataSafari");
        System.out.println(car);
        car = CarFactory.getCar("Tata");
        System.out.println(car);
    }
}
