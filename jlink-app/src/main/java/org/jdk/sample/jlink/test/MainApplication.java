package org.jdk.sample.jlink.test;

import org.jdk.sample.jlink.test.service.ServiceInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class MainApplication {
    public static void main(String[] args) {

        List<ServiceInterface> services = getServices();

        for (var service : services) {
            System.out.println("Service name  " + service.getServiceName());
            System.out.println("Service string" + service.getString());
        }

    }

    private static List<ServiceInterface> getServices() {
        List<ServiceInterface> services = new ArrayList<>();
        ServiceLoader.load(ServiceInterface.class).forEach(services::add);
        return services;
    }
}
