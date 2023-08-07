package jlink.sample.service.b;


import jlink.sample.base.ServiceInterface;

public class BServiceInterface implements ServiceInterface {

    public String getString() {
        return "B1_B2";
    }

    public String getServiceName() {
        return "BService";
    }
}
