
package com.livtrip.webservice.hotel;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>SearchRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RoomsInformation" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfRoomInfo" minOccurs="0"/&gt;
 *         &lt;element name="MaxPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="StarLevel" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AvailableOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PropertyType" type="{http://schemas.tourico.com/webservices/hotelv3}PropertyType"/&gt;
 *         &lt;element name="ExactDestination" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRequest", propOrder = {
    "destination",
    "hotelCityName",
    "hotelLocationName",
    "hotelName",
    "checkIn",
    "checkOut",
    "roomsInformation",
    "maxPrice",
    "starLevel",
    "availableOnly",
    "propertyType",
    "exactDestination"
})
public class SearchRequest {

    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "HotelCityName")
    protected String hotelCityName;
    @XmlElement(name = "HotelLocationName")
    protected String hotelLocationName;
    @XmlElement(name = "HotelName")
    protected String hotelName;
    @XmlElement(name = "CheckIn", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkIn;
    @XmlElement(name = "CheckOut", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkOut;
    @XmlElement(name = "RoomsInformation")
    protected ArrayOfRoomInfo roomsInformation;
    @XmlElement(name = "MaxPrice", required = true)
    protected BigDecimal maxPrice;
    @XmlElement(name = "StarLevel", required = true)
    protected BigDecimal starLevel;
    @XmlElement(name = "AvailableOnly")
    protected boolean availableOnly;
    @XmlElement(name = "PropertyType", required = true)
    @XmlSchemaType(name = "string")
    protected PropertyType propertyType;
    @XmlElement(name = "ExactDestination")
    protected boolean exactDestination;

    /**
     * 获取destination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 设置destination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * 获取hotelCityName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCityName() {
        return hotelCityName;
    }

    /**
     * 设置hotelCityName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCityName(String value) {
        this.hotelCityName = value;
    }

    /**
     * 获取hotelLocationName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelLocationName() {
        return hotelLocationName;
    }

    /**
     * 设置hotelLocationName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelLocationName(String value) {
        this.hotelLocationName = value;
    }

    /**
     * 获取hotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * 获取checkIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckIn() {
        return checkIn;
    }

    /**
     * 设置checkIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckIn(XMLGregorianCalendar value) {
        this.checkIn = value;
    }

    /**
     * 获取checkOut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOut() {
        return checkOut;
    }

    /**
     * 设置checkOut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOut(XMLGregorianCalendar value) {
        this.checkOut = value;
    }

    /**
     * 获取roomsInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomInfo }
     *     
     */
    public ArrayOfRoomInfo getRoomsInformation() {
        return roomsInformation;
    }

    /**
     * 设置roomsInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomInfo }
     *     
     */
    public void setRoomsInformation(ArrayOfRoomInfo value) {
        this.roomsInformation = value;
    }

    /**
     * 获取maxPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    /**
     * 设置maxPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPrice(BigDecimal value) {
        this.maxPrice = value;
    }

    /**
     * 获取starLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStarLevel() {
        return starLevel;
    }

    /**
     * 设置starLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStarLevel(BigDecimal value) {
        this.starLevel = value;
    }

    /**
     * 获取availableOnly属性的值。
     * 
     */
    public boolean isAvailableOnly() {
        return availableOnly;
    }

    /**
     * 设置availableOnly属性的值。
     * 
     */
    public void setAvailableOnly(boolean value) {
        this.availableOnly = value;
    }

    /**
     * 获取propertyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * 设置propertyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setPropertyType(PropertyType value) {
        this.propertyType = value;
    }

    /**
     * 获取exactDestination属性的值。
     * 
     */
    public boolean isExactDestination() {
        return exactDestination;
    }

    /**
     * 设置exactDestination属性的值。
     * 
     */
    public void setExactDestination(boolean value) {
        this.exactDestination = value;
    }

}
