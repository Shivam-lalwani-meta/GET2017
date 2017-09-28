/**
 * 
 */
package com.metacube.webservice;

import java.util.Scanner;

/**
 * @author Gaurav Tak
 *
 */
public class TemperatureConverterClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        FahranheitToCelsiusServiceLocator fahranheitToCelsiusServiceLocator=new FahranheitToCelsiusServiceLocator();
        fahranheitToCelsiusServiceLocator.setFahranheitToCelsiusEndpointAddress("http://localhost:8080/SOAPWebService/services/FahranheitToCelsius");
        do{
            try{
                FahranheitToCelsius fahranheitToCelsius=fahranheitToCelsiusServiceLocator.getFahranheitToCelsius();
                System.out.print("Enter temperature in fahraenheit : ");
                double convertedValue=fahranheitToCelsius.convertFahranheitToCelsius(new Scanner(System.in).nextDouble());
                System.out.println("Temperature in Celsius : "+convertedValue);
                }catch(Exception e){
                System.out.println("Exception found");
            }
        }while(true);
    }

}
