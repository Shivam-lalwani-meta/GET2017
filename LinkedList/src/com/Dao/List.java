
/** 
 * @author Shivam
 * @version 1.0
 * @Date 22-August-2017
 * @project Data Structure  Assignment 1
 */
package com.Dao;

public class List<E>{
	Node<E> head;		//head pointer
	int length = 0;	//length of list
	String result = null;	//String to hold Output

	//isEmpty method
	public boolean isEmpty(){
		return length == 0;
	}

	//method to add a node to List
	public String addNode(E data){
		Node<E> nodeToBeAdded = new Node<E>();
		nodeToBeAdded.data = (data);	//initializing value to new node
		//check if list is empty
		if(head == null){
			head = nodeToBeAdded;
			result = "Added Succesfully";
		} else{
			Node<E> currentNode = new Node<E>();	//temporary node
			currentNode.next = head;
			//traverse till null is not encountered
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = nodeToBeAdded;
			nodeToBeAdded.next = null;
			length++;
			result = "Appended Succesfully";
		}
		return result;
	}

	//method to add at a particular location/index
	public boolean addAtIndex(int index, E data){
		Node<E> nodeToBeAdded = new Node<E>();
		nodeToBeAdded.data = (data);	//initializing value to new node
		Node<E> currentNode = this.head;
		Node<E> prev = null;
		//if node is to be added at first index
		if(index == 0){
			nodeToBeAdded.next = currentNode;	//adding node pointing to same node as that of head
			this.head = nodeToBeAdded;	//head pointing to new node
			length++;
			return true;
		}
		else{
			//traverse till null is not encountered
			while(currentNode != null){
				index--;
				if( index == 0 ){
					prev.next = nodeToBeAdded;
					nodeToBeAdded.next = currentNode;
					length++;
					return true;
				}
				//iterating till index not found
				prev = currentNode;
				currentNode = currentNode.next;
			}
		}
		return false;	
	}

	//deleting element by position
	public String deleteNodeByIndex(int index){
		Node<E> currentNode = new Node<E>();
		currentNode = head;
		Node<E> previousNode = new Node<E>();
		boolean flag = true;
		try{
			if(index < 0 || index > length) {
				flag = false;
				result = "";
				throw new NullPointerException();
			}
		}catch(NullPointerException e) {
			System.out.println("Index is invalid");
		}
		if(isEmpty()) {
			result = "List is Empty";
		}
		//if node to be added at first index
		else if(index == 0){
			head = currentNode.next;
			result ="Deleted Succesfully";
		}
		else if(flag == true){
			//iterating till index not found
			while(index > 0){
				previousNode = currentNode;
				currentNode = currentNode.next;
				index--;
			}
			previousNode.next = currentNode.next;
			length--;
			result ="Deleted Succesfully";
		}
		return result;	//returning result String
	}

	//search a specified element
	public String searchByValue(E data){
		Node<E> currentNode = new Node<E>();	//traverse node
		currentNode = head;		//pointing to same element head pointing
		int index = 0;
		
		//traversing till NULL
		while(currentNode != null){
			if(currentNode.data.equals(data)){
				return result = data+" found at "+index;
			}
			currentNode = currentNode.next;
			index++;
		}	
		result = data+" not found";
		return result;
	}

	public E searchByIndex(int index){
		Node<E> currentNode = new Node<E>();	//traverse node
		currentNode = head;		//pointing to same element head pointing
		boolean flag = true;
		try{
			if(index < 0 || index > length) {
				flag = false;
				throw new NullPointerException();
			}
		}catch(NullPointerException e) {
			System.out.println("Index is invalid");
		}
		if(index == 0) {
			return (E) currentNode.data;
		}
		else if(flag == true){
			while(index > 0) {
				index--;
				currentNode = currentNode.next;
			}
			return currentNode.data;
		}
		return (E)"";
	}

	
	public E display(){
		Node<E> traverseNode = new Node<E>();	//traverse node
		traverseNode = head;

		//traversing till NULL
		while(traverseNode != null){
			System.out.println(traverseNode.data);
			traverseNode = traverseNode.next;
		}
		return (E)"";
	}

	public void reverseLinkedList() {
		Node<E> temp = this.head;
		Node<E> head1 = null;
		while (head != null) {
			temp = head;
			head = head.next;
			temp.next = head1;
			head1 = temp;
		}
		head = head1;
	}

	public void sort(){
		Node<E> temp1 = this.head;
		Node<E> temp2 = null;
		while( temp1 != null ){
			temp2 = temp1.next;
			while(temp2 != null){
				if( temp1.data.toString().compareTo(temp2.data.toString()) > 0 ){
					E temp = temp1.data;
					temp1.data = temp2.data;
					temp2.data = temp;
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
	}

	//method to delete element
	public String deleteNodeByValue(E element) {
		Node<E> currentNode = new Node<E>();
		Node<E> previousNode = new Node<E>();
		boolean flag = false;
		currentNode = head;

		if(isEmpty()) {
			result = "List is Empty";
		}
		else if((E)currentNode.data == element) {
			head = currentNode.next;
			result = element+"Deleted Succesfully";
		} else {
			while(currentNode.next != null) {
				previousNode = currentNode;
				currentNode = currentNode.next;
				if(currentNode.data.equals(element) ) {
					previousNode.next = currentNode.next;
					flag = true;
					System.out.println( "value deleted");
					result = element+"Deleted Succesfully";
					length--;
				}
				if(flag != true) {
					result = element+" not found";
				}
			}
		}
		return result;
	}
}


