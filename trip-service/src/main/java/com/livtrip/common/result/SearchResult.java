package com.livtrip.common.result;


import com.livtrip.webservice.hotel.ArrayOfHotel;
import com.livtrip.webservice.hotel.BookInfo;

import java.io.Serializable;

/**
 * Created by tangdu on 2016/12/8.
 */
public class SearchResult implements Serializable {
    protected BookInfo info;
    protected ArrayOfHotel hotelList;


    public BookInfo getInfo() {
        return info;
    }

    public void setInfo(BookInfo info) {
        this.info = info;
    }

    public ArrayOfHotel getHotelList() {
        return hotelList;
    }

    public void setHotelList(ArrayOfHotel hotelList) {
        this.hotelList = hotelList;
    }
}
