/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 22-August-2017
 * @project Data Structure Assignment 4
 *//*

/*This class is used to provide job priority according to preference of Object.
 * The problem is to execute the printer request of all requested department according to the priority of departments.
 * There are four departments:-
 * 1.Chairman
 * 2.Professor
 * 3.Graduates
 * 4.Under-graduates
 * Given problem has to be solved using Heap
 
public class Main {
	//main method to start execution
	public static void main(String[] args) {
		String resultHoldingString = "";	//result holding String
		Printer department1 = new Printer("Chairman",4);	//creating printer object with Message and Priority
		Printer department2 = new Printer("Professor",3);	//creating printer object with Message and Priority
		Printer department3 = new Printer("ugraduate1",1);	//creating printer object with Message and Priority
		Printer department4 = new Printer("graduate",2);	//creating printer object with Message and Priority
		Printer department5 = new Printer("ugraduate2",1);	//creating printer object with Message and Priority
		
		//creating heap class Object
		Heap heap = new Heap();
		heap.insert(department1);	//inserting Printer Object to heap
		heap.insert(department2);	//inserting Printer Object to heap
		heap.insert(department3);	//inserting Printer Object to heap
		heap.insert(department4);	//inserting Printer Object to heap
		heap.insert(department5);	//inserting Printer Object to heap
		//iterating loop to show priority-wise messages
		for(int i = 0; i < Printer.getNoOfObjects(); i++) {
			//heap.delete method gets the top element from Heap and add it to result string
			resultHoldingString += heap.delete() + "\n";
		}
		//printing the result string
		System.out.println(resultHoldingString);
	}
}
*/