
package com.livtrip.webservice.hotel;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-12-05T13:14:54.947+08:00
 * Generated source version: 3.1.8
 */

@WebFault(name = "WSFault", targetNamespace = "http://schemas.tourico.com/webservices/faults")
public class IHotelFlowGetRGInfoWSFaultFaultMessage extends Exception {
    
    private com.livtrip.webservice.hotel.WSFault wsFault;

    public IHotelFlowGetRGInfoWSFaultFaultMessage() {
        super();
    }
    
    public IHotelFlowGetRGInfoWSFaultFaultMessage(String message) {
        super(message);
    }
    
    public IHotelFlowGetRGInfoWSFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IHotelFlowGetRGInfoWSFaultFaultMessage(String message, com.livtrip.webservice.hotel.WSFault wsFault) {
        super(message);
        this.wsFault = wsFault;
    }

    public IHotelFlowGetRGInfoWSFaultFaultMessage(String message, com.livtrip.webservice.hotel.WSFault wsFault, Throwable cause) {
        super(message, cause);
        this.wsFault = wsFault;
    }

    public com.livtrip.webservice.hotel.WSFault getFaultInfo() {
        return this.wsFault;
    }
}