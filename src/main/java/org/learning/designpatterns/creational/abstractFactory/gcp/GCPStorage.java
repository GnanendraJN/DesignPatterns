package org.learning.designpatterns.creational.abstractFactory.gcp;

import org.learning.designpatterns.creational.abstractFactory.Storage;

public class GCPStorage implements Storage {

    public GCPStorage(int storageMib){
        System.out.println("Storage got created");
    }

    @Override
    public String getId() {
        return "GCPStorage_1";
    }
}
