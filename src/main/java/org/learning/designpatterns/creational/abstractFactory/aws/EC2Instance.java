package org.learning.designpatterns.creational.abstractFactory.aws;

import org.learning.designpatterns.creational.abstractFactory.Instance;
import org.learning.designpatterns.creational.abstractFactory.Storage;

public class EC2Instance implements Instance {

    public EC2Instance(Instance.Capacity capacity){
        System.out.println("Aws instance got created with capacity " + capacity);
    }

    @Override
    public void start() {
        System.out.println("STARTED - AWS instance ");
    }

    @Override
    public void stop() {
        System.out.println("STOPPED - AWS Instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Storage " + storage.getId() + " has attached");
    }
}
