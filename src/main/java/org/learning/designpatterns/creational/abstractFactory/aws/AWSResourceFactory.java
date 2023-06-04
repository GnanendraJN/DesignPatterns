package org.learning.designpatterns.creational.abstractFactory.aws;

import org.learning.designpatterns.creational.abstractFactory.Instance;
import org.learning.designpatterns.creational.abstractFactory.ResourceFactory;
import org.learning.designpatterns.creational.abstractFactory.Storage;

public class AWSResourceFactory extends ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new EC2Instance(capacity);
    }

    @Override
    public Storage createStorage(int storageMid) {
        return new S3Storage(storageMid);
    }

}
