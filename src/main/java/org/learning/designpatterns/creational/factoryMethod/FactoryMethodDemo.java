package org.learning.designpatterns.creational.factoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {

        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator){
        Message message = creator.getMessage();
        System.out.println(message);
    }
}
