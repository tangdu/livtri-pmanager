package com.livtrip.webservice.hotel;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-12-05T13:14:54.998+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://tourico.com/webservices/hotelv3", name = "IHotelFlow")
@XmlSeeAlso({ObjectFactory.class})
public interface IHotelFlow {

    @WebResult(name = "CostAmendResult", targetNamespace = "http://tourico.com/webservices/hotelv3")
    @Action(input = "http://tourico.com/webservices/hotelv3/IHotelFlow/CostAmend", output = "http://tourico.com/webservices/hotelv3/IHotelFlow/CostAmendResponse", fault = {@FaultAction(className = IHotelFlowCostAmendWSFaultFaultMessage.class, value = "CostAmend")})
    @RequestWrapper(localName = "CostAmend", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.CostAmend")
    @WebMethod(operationName = "CostAmend", action = "http://tourico.com/webservices/hotelv3/IHotelFlow/CostAmend")
    @ResponseWrapper(localName = "CostAmendResponse", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.CostAmendResponse")
    public com.livtrip.webservice.hotel.AmendResult costAmend(
            @WebParam(name = "request", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.CostAmendRequest request,
            @WebParam(name = "features", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.ArrayOfFeature features
    ) throws IHotelFlowCostAmendWSFaultFaultMessage;

    @WebResult(name = "SearchHotelsByIdResult", targetNamespace = "http://tourico.com/webservices/hotelv3")
    @Action(input = "http://tourico.com/webservices/hotelv3/IHotelFlow/SearchHotelsById", output = "http://tourico.com/webservices/hotelv3/IHotelFlow/SearchHotelsByIdResponse", fault = {@FaultAction(className = IHotelFlowSearchHotelsByIdWSFaultFaultMessage.class, value = "SearchHotelsById")})
    @RequestWrapper(localName = "SearchHotelsById", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.SearchHotelsById")
    @WebMethod(operationName = "SearchHotelsById", action = "http://tourico.com/webservices/hotelv3/IHotelFlow/SearchHotelsById")
    @ResponseWrapper(localName = "SearchHotelsByIdResponse", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.SearchHotelsByIdResponse")
    public com.livtrip.webservice.hotel.SearchResult searchHotelsById(
            @WebParam(name = "request", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.SearchHotelsByIdRequest request,
            @WebParam(name = "features", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.ArrayOfFeature features
    ) throws IHotelFlowSearchHotelsByIdWSFaultFaultMessage;

    @WebResult(name = "CheckAvailabilityAndPricesResult", targetNamespace = "http://tourico.com/webservices/hotelv3")
    @Action(input = "http://tourico.com/webservices/hotelv3/IHotelFlow/CheckAvailabilityAndPrices", output = "http://tourico.com/webservices/hotelv3/IHotelFlow/CheckAvailabilityAndPricesResponse", fault = {@FaultAction(className = IHotelFlowCheckAvailabilityAndPricesWSFaultFaultMessage.class, value = "CheckAvailabilityAndPrices")})
    @RequestWrapper(localName = "CheckAvailabilityAndPrices", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.CheckAvailabilityAndPrices")
    @WebMethod(operationName = "CheckAvailabilityAndPrices", action = "http://tourico.com/webservices/hotelv3/IHotelFlow/CheckAvailabilityAndPrices")
    @ResponseWrapper(localName = "CheckAvailabilityAndPricesResponse", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.CheckAvailabilityAndPricesResponse")
    public com.livtrip.webservice.hotel.SearchResult checkAvailabilityAndPrices(
            @WebParam(name = "request", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.SearchHotelsByIdRequest request,
            @WebParam(name = "features", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.ArrayOfFeature features
    ) throws IHotelFlowCheckAvailabilityAndPricesWSFaultFaultMessage;

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetCancellationPoliciesResponse", targetNamespace = "http://tourico.com/webservices/", partName = "parameters")
    @Action(input = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetCancellationPolicies", output = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetCancellationPoliciesResponse", fault = {@FaultAction(className = IHotelFlowGetCancellationPoliciesWSFaultFaultMessage.class, value = "GetCancellationPolicies")})
    @WebMethod(operationName = "GetCancellationPolicies", action = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetCancellationPolicies")
    public GetCancellationPoliciesResponse getCancellationPolicies(
            @WebParam(partName = "parameters", name = "GetCancellationPolicies", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    GetCancellationPolicies parameters
    ) throws IHotelFlowGetCancellationPoliciesWSFaultFaultMessage;

    @WebResult(name = "GetRGInfoResult", targetNamespace = "http://tourico.com/webservices/hotelv3")
    @Action(input = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetRGInfo", output = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetRGInfoResponse", fault = {@FaultAction(className = IHotelFlowGetRGInfoWSFaultFaultMessage.class, value = "GetRGInfo")})
    @RequestWrapper(localName = "GetRGInfo", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.GetRGInfo")
    @WebMethod(operationName = "GetRGInfo", action = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetRGInfo")
    @ResponseWrapper(localName = "GetRGInfoResponse", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.GetRGInfoResponse")
    public com.livtrip.webservice.hotel.RGInfoResults getRGInfo(
            @WebParam(name = "request", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.RGInfoRequest request
    ) throws IHotelFlowGetRGInfoWSFaultFaultMessage;

    @WebResult(name = "GetHotelDetailsV3Result", targetNamespace = "http://tourico.com/webservices/hotelv3")
    @Action(input = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetHotelDetailsV3", output = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetHotelDetailsV3Response", fault = {@FaultAction(className = IHotelFlowGetHotelDetailsV3WSFaultFaultMessage.class, value = "GetHotelDetailsV3")})
    @RequestWrapper(localName = "GetHotelDetailsV3", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.GetHotelDetailsV3")
    @WebMethod(operationName = "GetHotelDetailsV3", action = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetHotelDetailsV3")
    @ResponseWrapper(localName = "GetHotelDetailsV3Response", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.GetHotelDetailsV3Response")
    public com.livtrip.webservice.hotel.GetHotelDetailsV3Response.GetHotelDetailsV3Result getHotelDetailsV3(
            @WebParam(name = "HotelIds", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.ArrayOfHotelID hotelIds,
            @WebParam(name = "Features", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.ArrayOfFeature features
    ) throws IHotelFlowGetHotelDetailsV3WSFaultFaultMessage;

    @WebResult(name = "GetCancellationFeeResult", targetNamespace = "http://tourico.com/webservices/")
    @Action(input = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetCancellationFee", output = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetCancellationFeeResponse", fault = {@FaultAction(className = IHotelFlowGetCancellationFeeWSFaultFaultMessage.class, value = "GetCancellationFee")})
    @RequestWrapper(localName = "GetCancellationFee", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.GetCancellationFee")
    @WebMethod(operationName = "GetCancellationFee", action = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetCancellationFee")
    @ResponseWrapper(localName = "GetCancellationFeeResponse", targetNamespace = "http://tourico.com/webservices/", className = "com.livtrip.webservice.hotel.GetCancellationFeeResponse")
    public com.livtrip.webservice.hotel.CancellationFeeInfo getCancellationFee(
            @WebParam(name = "nResID", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    int nResID,
            @WebParam(name = "clxDate", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    javax.xml.datatype.XMLGregorianCalendar clxDate
    ) throws IHotelFlowGetCancellationFeeWSFaultFaultMessage;

    @WebResult(name = "GetTermAndConditionsResult", targetNamespace = "http://tourico.com/webservices/hotelv3")
    @Action(input = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetTermAndConditions", output = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetTermAndConditionsResponse", fault = {@FaultAction(className = IHotelFlowGetTermAndConditionsWSFaultFaultMessage.class, value = "GetTermAndConditions")})
    @RequestWrapper(localName = "GetTermAndConditions", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.GetTermAndConditions")
    @WebMethod(operationName = "GetTermAndConditions", action = "http://tourico.com/webservices/hotelv3/IHotelFlow/GetTermAndConditions")
    @ResponseWrapper(localName = "GetTermAndConditionsResponse", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.GetTermAndConditionsResponse")
    public com.livtrip.webservice.hotel.TermAndConditionsResult getTermAndConditions(
            @WebParam(name = "HotelId", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.TermAndConditionsRequest hotelId
    ) throws IHotelFlowGetTermAndConditionsWSFaultFaultMessage;

    @WebResult(name = "DoAmendResult", targetNamespace = "http://tourico.com/webservices/hotelv3")
    @Action(input = "http://tourico.com/webservices/hotelv3/IHotelFlow/DoAmend", output = "http://tourico.com/webservices/hotelv3/IHotelFlow/DoAmendResponse", fault = {@FaultAction(className = IHotelFlowDoAmendWSFaultFaultMessage.class, value = "DoAmend")})
    @RequestWrapper(localName = "DoAmend", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.DoAmend")
    @WebMethod(operationName = "DoAmend", action = "http://tourico.com/webservices/hotelv3/IHotelFlow/DoAmend")
    @ResponseWrapper(localName = "DoAmendResponse", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.DoAmendResponse")
    public com.livtrip.webservice.hotel.AmendResult doAmend(
            @WebParam(name = "request", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.AmendRequest request,
            @WebParam(name = "features", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.ArrayOfFeature features
    ) throws IHotelFlowDoAmendWSFaultFaultMessage;

    @WebResult(name = "SearchHotelsByDestinationIdsResult", targetNamespace = "http://tourico.com/webservices/hotelv3")
    @Action(input = "http://tourico.com/webservices/hotelv3/IHotelFlow/SearchHotelsByDestinationIds", output = "http://tourico.com/webservices/hotelv3/IHotelFlow/SearchHotelsByDestinationIdsResponse", fault = {@FaultAction(className = IHotelFlowSearchHotelsByDestinationIdsWSFaultFaultMessage.class, value = "SearchHotelsByDestinationIds")})
    @RequestWrapper(localName = "SearchHotelsByDestinationIds", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.SearchHotelsByDestinationIds")
    @WebMethod(operationName = "SearchHotelsByDestinationIds", action = "http://tourico.com/webservices/hotelv3/IHotelFlow/SearchHotelsByDestinationIds")
    @ResponseWrapper(localName = "SearchHotelsByDestinationIdsResponse", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.SearchHotelsByDestinationIdsResponse")
    public com.livtrip.webservice.hotel.SearchResult searchHotelsByDestinationIds(
            @WebParam(name = "request", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.SearchHotelsByDestinationIdsRequest request,
            @WebParam(name = "features", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.ArrayOfFeature features
    ) throws IHotelFlowSearchHotelsByDestinationIdsWSFaultFaultMessage;

    @WebResult(name = "SearchHotelsResult", targetNamespace = "http://tourico.com/webservices/hotelv3")
    @Action(input = "http://tourico.com/webservices/hotelv3/IHotelFlow/SearchHotels", output = "http://tourico.com/webservices/hotelv3/IHotelFlow/SearchHotelsResponse", fault = {@FaultAction(className = IHotelFlowSearchHotelsWSFaultFaultMessage.class, value = "SearchHotels")})
    @RequestWrapper(localName = "SearchHotels", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.SearchHotels")
    @WebMethod(operationName = "SearchHotels", action = "http://tourico.com/webservices/hotelv3/IHotelFlow/SearchHotels")
    @ResponseWrapper(localName = "SearchHotelsResponse", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.SearchHotelsResponse")
    public com.livtrip.webservice.hotel.SearchResult searchHotels(
            @WebParam(name = "request", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.SearchRequest request,
            @WebParam(name = "features", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.ArrayOfFeature features
    ) throws IHotelFlowSearchHotelsWSFaultFaultMessage;

    @WebResult(name = "BookHotelV3Result", targetNamespace = "http://tourico.com/webservices/hotelv3")
    @Action(input = "http://tourico.com/webservices/hotelv3/IHotelFlow/BookHotelV3", output = "http://tourico.com/webservices/hotelv3/IHotelFlow/BookHotelV3Response", fault = {@FaultAction(className = IHotelFlowBookHotelV3WSFaultFaultMessage.class, value = "BookHotelV3")})
    @RequestWrapper(localName = "BookHotelV3", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.BookHotelV3")
    @WebMethod(operationName = "BookHotelV3", action = "http://tourico.com/webservices/hotelv3/IHotelFlow/BookHotelV3")
    @ResponseWrapper(localName = "BookHotelV3Response", targetNamespace = "http://tourico.com/webservices/hotelv3", className = "com.livtrip.webservice.hotel.BookHotelV3Response")
    public com.livtrip.webservice.hotel.RGInfoResults bookHotelV3(
            @WebParam(name = "request", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.BookV3Request request,
            @WebParam(name = "features", targetNamespace = "http://tourico.com/webservices/hotelv3")
                    com.livtrip.webservice.hotel.ArrayOfFeature features
    ) throws IHotelFlowBookHotelV3WSFaultFaultMessage;
}
