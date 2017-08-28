import static org.junit.Assert.assertFalse;

import java.util.Hashtable;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestGuests {
	static Guests guest;
	static int totalNoOfRooms;
	static Hashtable<Integer, Guests> hashtable;
	String result = "";
	String expected = "";
	String result1 = "";
	String expected1 = "";
	
	@BeforeClass
	public static void setUp() {
		totalNoOfRooms = 15;
	}

	//Positive test Case
	@Test
	public void allocation1() {
		hashtable = new Hashtable<Integer, Guests>();
		Guests guest = new Guests("Shivam",21);	//creating Guests object with Name and age parameters
		Guests guest1 = new Guests("neel",21);	//creating Guests object with Name and age parameters
		Guests guest2 = new Guests("rajat",22);	//creating Guests object with Name and age parameters
		Guests guest3 = new Guests("gaurav",21);	//creating Guests object with Name and age parameters
		
		//putting unique hash code and guest in hash table
		hashtable.put(guest.hashfunction(guest, totalNoOfRooms, hashtable , 1), guest);
		hashtable.put(guest.hashfunction(guest1, totalNoOfRooms, hashtable , 1), guest1);
		hashtable.put(guest.hashfunction(guest2, totalNoOfRooms, hashtable , 1), guest2);
		hashtable.put(guest.hashfunction(guest3, totalNoOfRooms, hashtable , 1), guest3);
		//iterating on keys and displaying result
		for(int key : hashtable.keySet()) {
			result += "Room Number: " + key  + " Guest-Name : " + hashtable.get(key).getName();
		}
		expected = "Room Number: 8 Guest-Name : rajatRoom Number: 7 Guest-Name : ShivamRoom Number: 6 Guest-Name : gauravRoom Number: 14 Guest-Name : neel";
		Assert.assertEquals(result, expected);	//unit-test
	}
	
	//Negative test Case
		@Test
		public void allocation2() {
			hashtable = new Hashtable<Integer, Guests>();
			Guests guest = new Guests("Shivam",21);	//creating Guests object with Name and age parameters
			Guests guest1 = new Guests("neel",21);	//creating Guests object with Name and age parameters
			Guests guest2 = new Guests("rajat",22);	//creating Guests object with Name and age parameters
			Guests guest3 = new Guests("gaurav",21);	//creating Guests object with Name and age parameters
			
			//putting unique hash code and guest in hash table
			hashtable.put(guest.hashfunction(guest, totalNoOfRooms, hashtable , 1), guest);
			hashtable.put(guest.hashfunction(guest1, totalNoOfRooms, hashtable , 1), guest1);
			hashtable.put(guest.hashfunction(guest2, totalNoOfRooms, hashtable , 1), guest2);
			hashtable.put(guest.hashfunction(guest3, totalNoOfRooms, hashtable , 1), guest3);
			//iterating on keys and displaying result
			for(int key : hashtable.keySet()) {
				result1 += "Room Number: " + key  + " Guest-Name : " + hashtable.get(key).getName();
			}
			expected1 = "Room Number: 8 Guest-Name : rajatRoom Number: 7 Guest-Name : ShivamRoom Number: 6 Guest-Name : gauravRoom Number: 14 Guest-Name : neel";
			assertFalse(result1 == expected1);	//unit-test
		}
}
