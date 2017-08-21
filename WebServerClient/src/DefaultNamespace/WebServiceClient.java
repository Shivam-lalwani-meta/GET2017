package DefaultNamespace;

import java.util.Scanner;

public class WebServiceClient {

	public static void main(String[] args) {
		FahrenheitToCelsiusServiceLocator fcsl= new FahrenheitToCelsiusServiceLocator();
		fcsl.setFahrenheitToCelsiusEndpointAddress("http://localhost:8080/WebServer/services/FahrenheitToCelsius");
		try{	
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the temperature in fahrenhit");
			double temp = 0.0;
			boolean flag = true;
			FahrenheitToCelsius result = fcsl.getFahrenheitToCelsius();
			while(flag){
				try{
					temp = Double.parseDouble(scanner.next());
					if(String.class.isInstance(temp)){
						throw new IllegalArgumentException();
					}
					flag = false;
				} catch(IllegalArgumentException e){
					System.out.println("Please Enter vaild  temperature");
				}
			}
		double roundOff = result.convertFahrenheitToCelsius(temp);
		double resultRoundOff = Math.round(roundOff * 100.0) / 100.0;
		System.out.println("Temperature in celsius is : " + resultRoundOff );  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}