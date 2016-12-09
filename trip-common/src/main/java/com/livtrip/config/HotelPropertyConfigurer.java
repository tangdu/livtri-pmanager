package com.livtrip.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by tangdu on 2016/12/7.
 */
public class HotelPropertyConfigurer {

    private static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(HotelPropertyConfigurer.class.getResourceAsStream("/tourico.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key) {
        return properties.getProperty(key);
    }

    public static int getIntValue(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }

    public static boolean getBooleanValue(String key) {
        return Boolean.parseBoolean(properties.getProperty(key));
    }

    public static final  String GETHOTELFLOWWSDL = properties.getProperty("hotelflow.wsdl");

    public static final String GETHOTELFLOWUSERNAME = properties.getProperty("hotelflow.username");

    public static final String GETHOTELFLOWPWD = properties.getProperty("hotelflow.password");

    public static final String GETDESTINATIONWSDL = properties.getProperty("destination.wsdl");

    public static final String GETDESTINATIONUSERNAME = properties.getProperty("hotelflow.username");

    public static final String GETDESTINATIONPWD = properties.getProperty("hotelflow.password");
}
