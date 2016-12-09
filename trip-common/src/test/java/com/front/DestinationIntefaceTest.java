package com.front;

import com.alibaba.fastjson.JSON;
import com.livtrip.config.HotelPropertyConfigurer;
import com.livtrip.webservice.destination.Destination;
import com.livtrip.webservice.destination.DestinationResult;
import com.livtrip.webservice.destination.IDestinationContracts;
import com.livtrip.webservice.destination.WSDestinationService;
import com.livtrip.webservice.handler.DestinationPHandler;
import com.livtrip.webservice.handler.HotelSOAPHandler;
import com.livtrip.webservice.hotel.*;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangdu on 2016/12/8.
 */
public class DestinationIntefaceTest {
    public static void main(String args[]) throws Exception {
        WSDestinationService service = new WSDestinationService();
        service.setHandlerResolver(new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<Handler>();
                handlerList.add(new DestinationPHandler());
                return handlerList;
            }
        });

        IDestinationContracts port = service.getIISDestinationHosting();
        Destination destination=new Destination();
        destination.setCity("Madrid");
        destination.setContinent("Europe");
        destination.setCountry("Spain");
        DestinationResult result= port.getDestination(destination);
        System.out.println(result);
    }

    public static void query(IHotelFlow port) {

    }
}
