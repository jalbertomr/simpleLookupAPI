package org.demo;

import org.demo.services.ServiceInterface;

public class ServiceProvider2 implements ServiceInterface{

    @Override
    public String getName() {
        return "returns ServiceProvider2 from 2AppDemoService which implements ServiceInterface from 1AppDemoService";
    }
    
}
