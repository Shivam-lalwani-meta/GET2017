
/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 22-August-2017
 * @project Data Structure Assignment 4
 */

/*The Heap is sorted at any insertion or deletion, on the time of deletion it gives the highest-valued
 * element .
 * The priority of each object is passed to Heap and at the time of deletion we have the sorted priorities.
 */
public class Heap {
	
	//default_size of array
	private static int DEFAULT_SIZE = 10;	
	
	//Printer Array to store Printer Object
	private Printer[] heapArray;	
	
	//current size of array
	private int arraySize;	
	
	/**
	 * Instantiates a new heap.
	 */
	public Heap() {
		heapArray = new Printer[DEFAULT_SIZE];	//initializing array of Default size
		arraySize = 0;
	}
	
	/**
	 * Gets the heap array.
	 *
	 * @return the heap array
	 */
	public Printer[] getHeapArray() {
		return heapArray;
	}
	
	/**
	 * Sets the heap array.
	 *
	 * @param heapArray the new heap array
	 */
	public void setHeapArray(Printer[] heapArray) {
		this.heapArray = heapArray;
	}
	
	/**
	 * Gets the array size.
	 *
	 * @return the array size
	 */
	public int getArraySize() {
		return arraySize;
	}
	
	/**
	 * Sets the array size.
	 *
	 * @param arraySize the new array size
	 */
	public void setArraySize(int arraySize) {
		this.arraySize = arraySize;
	}
	
	/**
	 * Insert.
	 *
	 * @param dep1 the department 1
	 */
	public void insert(Printer dep1) {
		//resize(); can be resized in run time
		//throwing ArrayIndexOutOfBoundsException
		try {
			if(arraySize == (DEFAULT_SIZE - 1)) {
				throw new ArrayIndexOutOfBoundsException();
			}	
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}  catch (Throwable any) {                           
            System.out.println("Unexpected error! "+any);
      }
		//Inserting the object at last index of Heap
		heapArray[arraySize++] = dep1;
		//heapifying
		heapifyUp(arraySize-1);
	}
	
	/**
	 * Resize.
	 *//*
	private void resize() {
		DEFAULT_SIZE = DEFAULT_SIZE * 2;
		heapArray = Arrays.copyOf(heapArray, DEFAULT_SIZE);
	}*/
	
	/**
	 * Delete.
	 *
	 * @return the string
	 */
	public String delete() {
		/*After heapify the highest element is at the top (in Max Heap), returning the top element and
		*putting last element at top and heapify it.
		**/ 
		Printer removedElement = heapArray[0];
		heapArray[0] = heapArray[arraySize - 1];
		arraySize--;	//decreasing size of array
		heapifyDown(0); //heapify
		return removedElement.getMessage();
	}
	
	/**
	 * Heapify down, to check the value of parent with children and swap if children are larger in value
	 *
	 * @param index to be heapify
	 */
	private void heapifyDown(int index) {
		//exit condition
		if((2*index+1) > arraySize) {
			return;
		}
		//swap and heapify if condition is true
		else if(( heapArray[index].getPriority() < (heapArray[maximumValueOf(2*index+1, 2*index+2)]).getPriority())){
			swap(index, maximumValueOf(2*index+1, 2*index+2));
			heapifyDown(maximumValueOf(2*index+1, 2*index+2));
		} else {
			return;
		}
	}
	
	/**
	 * Maximum value of.
	 *
	 * @param index1 the index 1
	 * @param index2 the index 2
	 * @return the index of largest valued child
	 */
	private int maximumValueOf(int index1, int index2) {
		if(heapArray[index2] == null) {
			return index1;
		}
		if(heapArray[index1] == null) {
			return -1;
		}
		if(heapArray[index1].getPriority() > (heapArray[index2]).getPriority()) {
			return index1;
		} else {
			return index2;
		}
	}
	
	/**
	 * Heapify up, to check the value of children to parent and swap if children are larger in value
	 * 
	 * @param index the index
	 */
	private void heapifyUp(int index) {
		if(index <= 0) {
			return;
		} else if( heapArray[index].getPriority() > (heapArray[(index-1)/2]).getPriority()) {
			swap(index ,(index-1)/2);
			heapifyUp((index-1)/2);
		} else {
			return;
		}
	}
	
	/**
	 * Swap, to swap two indexes
	 *
	 * @param index1 the index 1
	 * @param index2 the index 2
	 */
	private void swap(int index1, int index2){
		Printer temp = heapArray[index1];
		heapArray[index1] = heapArray[index2];
		heapArray[index2] = temp;
	}
	
	/**
	 * Display heap array.
	 */
	public void displayHeapArray() {
		for(int counter=0; counter < arraySize; counter++ ) {
			System.out.println(heapArray[counter].getMessage() + " " +heapArray[counter].getPriority());
		}
	}
}
