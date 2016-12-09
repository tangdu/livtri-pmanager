
package com.livtrip.webservice.destination;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-12-08T17:41:16.176+08:00
 * Generated source version: 3.1.8
 * 
 */
public final class IDestinationContracts_IISDestinationHosting_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "WSDestinationService");

    private IDestinationContracts_IISDestinationHosting_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = WSDestinationService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        WSDestinationService ss = new WSDestinationService(wsdlURL, SERVICE_NAME);
        IDestinationContracts port = ss.getIISDestinationHosting();  
        
        {
        System.out.println("Invoking getActivitiesByDestination...");
        Destination _getActivitiesByDestination_destination = null;
        try {
            DestinationResult _getActivitiesByDestination__return = port.getActivitiesByDestination(_getActivitiesByDestination_destination);
            System.out.println("getActivitiesByDestination.result=" + _getActivitiesByDestination__return);

        } catch (IDestinationContractsGetActivitiesByDestinationCustomExceptionMessageFaultFaultMessage e) { 
            System.out.println("Expected exception: IDestinationContracts_GetActivitiesByDestination_CustomExceptionMessageFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getHotelsByDestination...");
        Destination _getHotelsByDestination_destination = null;
        try {
            DestinationResult _getHotelsByDestination__return = port.getHotelsByDestination(_getHotelsByDestination_destination);
            System.out.println("getHotelsByDestination.result=" + _getHotelsByDestination__return);

        } catch (IDestinationContractsGetHotelsByDestinationCustomExceptionMessageFaultFaultMessage e) { 
            System.out.println("Expected exception: IDestinationContracts_GetHotelsByDestination_CustomExceptionMessageFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDestination...");
        Destination _getDestination_destination = null;
        try {
            DestinationResult _getDestination__return = port.getDestination(_getDestination_destination);
            System.out.println("getDestination.result=" + _getDestination__return);

        } catch (IDestinationContractsGetDestinationCustomExceptionMessageFaultFaultMessage e) { 
            System.out.println("Expected exception: IDestinationContracts_GetDestination_CustomExceptionMessageFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
