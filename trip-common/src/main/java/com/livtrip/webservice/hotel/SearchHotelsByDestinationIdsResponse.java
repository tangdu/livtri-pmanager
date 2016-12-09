
package com.livtrip.webservice.hotel;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchHotelsByDestinationIdsResult" type="{http://schemas.tourico.com/webservices/hotelv3}SearchResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchHotelsByDestinationIdsResult"
})
@XmlRootElement(name = "SearchHotelsByDestinationIdsResponse", namespace = "http://tourico.com/webservices/hotelv3")
public class SearchHotelsByDestinationIdsResponse {

    @XmlElement(name = "SearchHotelsByDestinationIdsResult", namespace = "http://tourico.com/webservices/hotelv3")
    protected SearchResult searchHotelsByDestinationIdsResult;

    /**
     * 获取searchHotelsByDestinationIdsResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getSearchHotelsByDestinationIdsResult() {
        return searchHotelsByDestinationIdsResult;
    }

    /**
     * 设置searchHotelsByDestinationIdsResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setSearchHotelsByDestinationIdsResult(SearchResult value) {
        this.searchHotelsByDestinationIdsResult = value;
    }

}
