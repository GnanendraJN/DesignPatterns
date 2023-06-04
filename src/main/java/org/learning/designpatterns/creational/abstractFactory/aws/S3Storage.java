package org.learning.designpatterns.creational.abstractFactory.aws;

import org.learning.designpatterns.creational.abstractFactory.Storage;

public class S3Storage implements Storage {

    public S3Storage(int storageMib){
        System.out.println("S3Storage created with storage capacity " + storageMib);
    }

    @Override
    public String getId() {
        return "AWS_S3";
    }
}
