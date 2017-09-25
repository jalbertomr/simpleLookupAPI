package appservicedisplayer;

import java.util.Iterator;
import java.util.ServiceLoader;
import org.demo.services.ServiceInterface;

public class AppServiceDisplayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceLoader<ServiceInterface> sl = ServiceLoader.load(ServiceInterface.class);
        Iterator<ServiceInterface> iterator = sl.iterator();
        while(iterator.hasNext()) {
            try{
              ServiceInterface next = iterator.next();
              System.out.println("Service Called:" + next.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        //for (ServiceInterface sInterface : sl) {
        //    System.out.println("Service Called: " + sInterface.getName());
        //}

        //for(ServiceInterface sInterface : ServiceLoader.load(ServiceInterface.class)) {
        //    System.out.println("Service Called: " + sInterface.getName()); 
        //}
        
    }
    
}
