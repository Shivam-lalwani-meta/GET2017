/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 25 August 2017
 * @Class main class to take name and number of Guests and allocate them different room numbers
 * according to their age using hash table
 *//*
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int totalNoOfRooms = 15;	//total number of rooms in hotel
		String name;
		int age;
		Hashtable<Integer, Guests> hashtable = new Hashtable<Integer, Guests>();	//hash table to store mapping
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of guests");
		int noOfGuests = Validation.integerValidation();
		//loop work for number of users entered by user
		for(int i = 0 ; i < noOfGuests ; i++ ) {
			System.out.println("Ënter name");
			name = Validation.stringValidation();
			System.out.println("Ënter age");
			age = Validation.integerValidation();
			Guests guest = new Guests(name, age);
			//unique hash code is generated each time
			int generatedHash = guest.hashfunction(guest, totalNoOfRooms, hashtable , 1);
			if(generatedHash == -1) {
				System.out.println("Rooms list");
				break;
			}
			//updating hash table till vacant rooms are available
			hashtable.put(generatedHash, guest);
		}
		//printing hash table
		for(int key : hashtable.keySet()) {
			System.out.println("Room Number: " + key  + " Guest-Name : " + hashtable.get(key).getName());
		}
		sc.close();
	}
}	*/