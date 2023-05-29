package org.learning.designpatterns.creational.factoryMethod;

public class TextMessageCreator extends MessageCreator{
    @Override
    public Message getMessage() {
        return new TextMessage();
    }
}
