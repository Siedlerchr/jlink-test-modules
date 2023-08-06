package org.jdk.sample.jlink.test.service.a;

import org.jdk.sample.jlink.test.service.ServiceInterface;


public class AInterface implements ServiceInterface {

    public String getString() { return "A1_A2"; }

    public String getServiceName() {
        return "AService";
    }
}
