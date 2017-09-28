/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 28-August-2017
 * @project Data Structure Assignment 5
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//to run test-cases according to NAME_ASCENDING order
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestQueueCollection {

	private QueueCollection<Integer> queueObject;
	private String result = "";
	private String expected = "";
	private int resultInt = 0;
	
	@Before
	public void setup(){
		queueObject = new QueueCollection<Integer>();
		queueObject.enqueue(25);
		queueObject.enqueue(35);
		queueObject.enqueue(41);
		queueObject.enqueue(78);
		queueObject.enqueue(19);
		queueObject.enqueue(32);
	}

	//Positive test-case for Enqueue
	@Test
	public void testA() {
		resultInt = queueObject.getFirst();
		assertEquals(25, resultInt);
		System.out.println("1");
	}

	//Positive test-case for Dequeue and Print-Queue
	@Test
	public void testB() {
		resultInt = queueObject.dequeue();
		assertEquals(25, resultInt);
		result = queueObject.printQueue();
		expected = "3541781932";
		assertEquals(expected, result);
		System.out.println("2");
	}

	//Positive test-case for Get-Last
	@Test
	public void testC() {
		resultInt = queueObject.getLast();
		assertEquals(32, resultInt);
		System.out.println("3");
	}

	//Negative test-case for Enqueue
	@Test
	public void testD() {
		resultInt = queueObject.getFirst();
		assertFalse(44 == resultInt);
		System.out.println("4");
	}

	//Negative test-case for Dequeue and Print-Queue
	@Test
	public void testE() {
		resultInt = queueObject.dequeue();
		assertFalse(26 == resultInt);
		result = queueObject.printQueue();
		expected = "41781932";
		assertFalse(expected.equals(result));
		System.out.println("5");
	}

	//Negative test-case for Get-Last
	@Test
	public void testF() {
		resultInt = queueObject.getLast();
		assertFalse(30 == resultInt);
		System.out.println("6");
	}
}