
package com.livtrip.webservice.destination;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-12-08T17:41:16.349+08:00
 * Generated source version: 3.1.8
 */

@WebFault(name = "CustomExpMsg", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts")
public class IDestinationContractsGetActivitiesByDestinationCustomExceptionMessageFaultFaultMessage extends Exception {
    
    private CustomExpMsg customExpMsg;

    public IDestinationContractsGetActivitiesByDestinationCustomExceptionMessageFaultFaultMessage() {
        super();
    }
    
    public IDestinationContractsGetActivitiesByDestinationCustomExceptionMessageFaultFaultMessage(String message) {
        super(message);
    }
    
    public IDestinationContractsGetActivitiesByDestinationCustomExceptionMessageFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IDestinationContractsGetActivitiesByDestinationCustomExceptionMessageFaultFaultMessage(String message, CustomExpMsg customExpMsg) {
        super(message);
        this.customExpMsg = customExpMsg;
    }

    public IDestinationContractsGetActivitiesByDestinationCustomExceptionMessageFaultFaultMessage(String message, CustomExpMsg customExpMsg, Throwable cause) {
        super(message, cause);
        this.customExpMsg = customExpMsg;
    }

    public CustomExpMsg getFaultInfo() {
        return this.customExpMsg;
    }
}
