package org.learning.designpatterns.creational.factoryMethod;

public class TextMessage extends Message{
    @Override
    public String getContent() {
        return "Hello Text Message";
    }
}
