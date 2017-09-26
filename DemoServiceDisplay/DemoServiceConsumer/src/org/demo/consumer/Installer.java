/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.demo.consumer;


import org.demo.service.ServiceInterface;
import org.openide.modules.ModuleInstall;
import org.openide.util.Lookup;

public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        System.out.println("Windows Restored...");
        for(ServiceInterface si : Lookup.getDefault().lookupAll(ServiceInterface.class)){
            System.out.println("Service Called: " + si.getName());
        }
    }

}
