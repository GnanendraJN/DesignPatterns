package org.learning.designpatterns.creational.abstractFactory.gcp;

import org.learning.designpatterns.creational.abstractFactory.Instance;
import org.learning.designpatterns.creational.abstractFactory.Storage;

public class GCPInstance implements Instance {

    public GCPInstance(Instance.Capacity capacity){
        System.out.println("GCPInstance got created");
    }
    @Override
    public void start() {
        System.out.println("GCP instance started");
    }

    @Override
    public void stop() {
        System.out.println("GCP instance got stopped");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Storage " + storage.getId() + " got attached to gcp instance");
    }
}
