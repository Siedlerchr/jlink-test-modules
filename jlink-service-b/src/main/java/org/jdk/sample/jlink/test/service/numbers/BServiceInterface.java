package org.jdk.sample.jlink.test.service.numbers;

import org.jdk.sample.jlink.test.service.ServiceInterface;

public class BServiceInterface implements ServiceInterface {

    public String getString() { return "B1_B2";}

    public String getServiceName() {
        return "BService";
    }
}
