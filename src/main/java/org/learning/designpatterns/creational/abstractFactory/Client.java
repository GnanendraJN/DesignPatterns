package org.learning.designpatterns.creational.abstractFactory;

import org.learning.designpatterns.creational.abstractFactory.aws.AWSResourceFactory;
import org.learning.designpatterns.creational.abstractFactory.gcp.GoogleCloudResourceFactory;

public class Client {

    public ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory){
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib){
        Instance instance = resourceFactory.createInstance(capacity);
        Storage storage = resourceFactory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client client = new Client(new AWSResourceFactory());
        Instance instance = client.createServer(Instance.Capacity.micro, 125000);
        instance.start();
        instance.stop();

        System.out.println("*_*_*_*_*_*");
        Client client2 = new Client(new GoogleCloudResourceFactory());
        instance = client2.createServer(Instance.Capacity.large, 2560000);
        instance.start();
        instance.stop();
        System.out.println();
    }
}
