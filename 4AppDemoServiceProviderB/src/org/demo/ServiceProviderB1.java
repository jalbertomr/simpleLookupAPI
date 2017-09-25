package org.demo;

import org.demo.services.ServiceInterface;

public class ServiceProviderB1 implements ServiceInterface {

    @Override
    public String getName() {
        return "returns ServiceProviderB1 from 4AppDemoService which implements ServiceInterface from 1AppDemoService";
    }
    
}
