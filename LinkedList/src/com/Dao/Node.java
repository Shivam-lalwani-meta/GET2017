
/** 
 * @author Shivam
 * @version 1.0
 * @Date 22-August-2017
 * @project Data Structure  Assignment 1
 */
package com.Dao;

//Node class to fetch new node each time, when required
public class Node<E> {
	public E data;
	public Node<E> next;

	//default constructor
	public Node() {
		E data ;
		next = null;
	}
 
	public Node<E> getNode(E data) {
		Node<E> node = new Node<E>();
		node.data = data;
		node.next = null;
		return node;
	}
}

