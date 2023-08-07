package jlink.sample.service.a;

import jlink.sample.base.ServiceInterface;

public class AInterface implements ServiceInterface {

    public String getString() {
        return "A1_A2";
    }

    public String getServiceName() {
        return "AService";
    }
}
