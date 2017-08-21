package com.metacube.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class FahranheitToCelsius {
    @WebMethod
    public double convertFahranheitToCelsius(double temperature) {
        return (temperature-32)*5/9;
    }
}
