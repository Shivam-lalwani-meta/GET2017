/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 28-August-2017
 * @project Data Structure Assignment 5
 */
import java.util.Iterator;
import java.util.LinkedList;

/**
 * The Class QueueCollection.
 *
 * @param <E> the element type
 */
public class QueueCollection<E> {

	/*Creating queue would require you to create instance of LinkedList and assign 
    it to LinkedList*/
	private LinkedList<E> queue;
	private String result = "";
	
	/**
	 * Instantiates a new queue collection.
	 */
	public QueueCollection() {
		queue = new LinkedList<E>();
	}

	/**
	 * Enqueue.
	 *
	 * @param element ,the element to be enqueued
	 * @return the element
	 */
	//you add elements to queue using add method
	public E enqueue(E element){
		try{
			queue.add(element);
			if(queue.isEmpty()) {
				throw new NullPointerException();
			}
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		return element;
	}

	/**
	 * Dequeue.
	 *
	 * @return the element
	 */
	public E dequeue(){
		return queue.remove();
	}

	/**
	 * Gets the first.
	 *
	 * @return the first
	 */
	public E getFirst(){
		return queue.getFirst();
	}

	/**
	 * Gets the last.
	 *
	 * @return the last
	 */
	public E getLast(){
		return queue.getLast();
	}

	/**
	 * Prints the queue.
	 *
	 * @return the string
	 */
	public String printQueue(){
		//access via Iterator
		Iterator<E> iterator = queue.iterator();
		while(iterator.hasNext()){
			result += iterator.next();
		}
		return result;
	}
}



