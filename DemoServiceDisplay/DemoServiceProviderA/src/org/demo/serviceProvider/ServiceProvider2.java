/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.demo.serviceProvider;

import org.demo.service.ServiceInterface;

/**
 *
 * @author Bext
 */
public class ServiceProvider2 implements ServiceInterface{

    @Override
    public String getName() {
        return "ServiceProvider2 from DemoServiceProviderA which implements ServiceInterface from DemoService";
    }
    
}
