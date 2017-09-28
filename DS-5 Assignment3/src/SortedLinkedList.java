/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 28-August-2017
 * @project Data Structure Assignment 5
 */
import java.util.LinkedList;
import java.util.List;


/**
 * The Class SortedLinkedList which adds the element in list in a sorted manner.
 * That is , the element is to be inserted at right index.
 */
public class SortedLinkedList {
	
	/** The list obj. */
	private List<Integer> listObj;
	
	/** The index. */
	private int index;

	/**
	 * Instantiates a new sorted linked list.
	 */
	public SortedLinkedList(){
		listObj = new LinkedList<Integer>();
	}

	/**
	 * Adds the.
	 *
	 * @param element the element
	 */
	public void add(int element) {
		sort(element, index);
	}

	/**
	 * Sort.
	 *
	 * @param element, the element to be added
	 * @param index, the index at which the element is to be added
	 * @return the list
	 */
	private List<Integer> sort(int element, int index) {
		//if the element to be inserted at first index
		if(listObj.size() == index) {
			listObj.add(element);
			return listObj;
		} else if(element > listObj.get(index)) { //if the element is greater in value, compare with next index
			sort(element, index+1);
		} else{
			listObj.add(index, element);	//if it is smaller, add it to that index
		}
		return listObj;
	}
	
	/**
	 * Gets the list obj.
	 *
	 * @return the list obj
	 */
	public List<Integer> getListObj() {
		return listObj;
	}
}
