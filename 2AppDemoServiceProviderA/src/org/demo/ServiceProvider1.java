package org.demo;

import org.demo.services.ServiceInterface;

public class ServiceProvider1 implements ServiceInterface {

    @Override
    public String getName() {
        return "returns ServiceProvider1 from 2AppDemoService which implements ServiceInterface from 1AppDemoService";
    }
    
}
