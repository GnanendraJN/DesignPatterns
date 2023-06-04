package org.learning.designpatterns.creational.abstractFactory;

public interface Instance {
    enum Capacity{micro, small, large}

    void start();
    void stop();

    void attachStorage(Storage storage);
}
