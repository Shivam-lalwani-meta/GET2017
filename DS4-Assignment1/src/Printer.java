/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 22-August-2017
 * @project Data Structure Assignment 4
 */
/**
 * The Class Printer, is a class to hold message and priority of particular Object, and putting them into heap
 * The Heap is sorted at any insertion or deletion, on the time of deletion it gives the highest-valued
 * element .
 * The priority of each object is passed to Heap and at the time of deletion we have the sorted priorities.
 */
public class Printer {
	
	/** The message. */
	private String message;
	
	public static void setNoOfObjects(int noOfObjects) {
		Printer.noOfObjects = noOfObjects;
	}

	/** The priority. */
	private int priority;
	
	/** The no of objects. */
	private static int noOfObjects = 0;
	
	/**
	 * Gets the message.
	 *
	 * @return the message String
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Gets the no of objects.
	 *
	 * @return the no of objects created.
	 */
	public static int getNoOfObjects() {
		return noOfObjects;
	}
	
	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * Instantiates a new printer.
	 *
	 * @param message the message
	 * @param priority the priority
	 */
	public Printer(String message, int priority) {
		noOfObjects++;	//increases each time the object is created
		this.message = message;
		this.priority = priority;
	}
	
	/**
	 * Gets the priority.
	 *
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}
	
	/**
	 * Sets the priority.
	 *
	 * @param priority the new priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}
}
