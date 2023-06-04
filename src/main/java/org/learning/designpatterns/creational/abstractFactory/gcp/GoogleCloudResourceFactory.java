package org.learning.designpatterns.creational.abstractFactory.gcp;

import org.learning.designpatterns.creational.abstractFactory.Instance;
import org.learning.designpatterns.creational.abstractFactory.ResourceFactory;
import org.learning.designpatterns.creational.abstractFactory.Storage;

public class GoogleCloudResourceFactory extends ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GCPInstance(capacity);
    }

    @Override
    public Storage createStorage(int storageMid) {
        return new GCPStorage(storageMid);
    }
}
