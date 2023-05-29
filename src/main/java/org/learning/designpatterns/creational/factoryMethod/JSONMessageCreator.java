package org.learning.designpatterns.creational.factoryMethod;

public class JSONMessageCreator extends MessageCreator{
    @Override
    public Message getMessage() {
        return new JSONMessage();
    }
}
