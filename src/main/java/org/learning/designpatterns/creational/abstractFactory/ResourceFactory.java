package org.learning.designpatterns.creational.abstractFactory;

public abstract class ResourceFactory {

    public abstract Instance createInstance(Instance.Capacity capacity);
    public abstract Storage createStorage(int storageMid);
}
