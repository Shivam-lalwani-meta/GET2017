/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 25 August 2017
 * @Class The Guest class having attributes of Guests (String Name ,int age) and is defined to find
 * hash function to allocate rooms to guests depending on there age.
 * If the age of two Guests are same then linear probing function is invoked through recursion.
 * HashCode is returned to main class o generate Hash table
 */
import java.util.Hashtable;

/**
 * The Class Guests.
 */
//
public class Guests {
	
	/** The name. */
	private String name;
	
	/** The age. */
	private int age;
	
	/** The count. */
	public int count=0;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Instantiates a new guests.
	 *
	 * @param name the name
	 * @param age the age
	 */
	public Guests(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Hash function.
	 *
	 * @param guest, the guest object containing the name and age of a particular Guest
	 * @param totalNoOfRooms, the total no of rooms available in Hotel
	 * @param hashtable, the hash table of Guest and Room number
	 * @param roomNo, the room no
	 * @return the Hash code.
	 */
	public int hashfunction(Guests guest, int totalNoOfRooms, Hashtable<Integer, Guests> hashtable,int roomNo ) {
		//counter
		count++;
		//to overcome from Stack-Overflow
		if(count > totalNoOfRooms) {
			return -1;
		}
		//hash function
		roomNo = ((roomNo << 4)+ guest.getAge()) % totalNoOfRooms;
		//if the hash code already generated, move to next available slot
		if(hashtable.containsKey(roomNo)) {
			roomNo = hashfunction(guest, totalNoOfRooms, hashtable, ++roomNo);
		}
		return roomNo;
	}
}