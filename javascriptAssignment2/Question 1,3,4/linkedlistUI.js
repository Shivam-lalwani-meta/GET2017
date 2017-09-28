
function SinglyLinkedList() {
	var length = 0;
	var head = null;
	
	var Node = function(element) {
		this.element = element;
		this.next = null;
	};
	
	this.size = function(){
		return length;
	}
	
	this.head = function(){
		return head;
	}
	
	this.addElement = function(){
		var element = document.getElementById("element").value;
		document.getElementById("element").value = "";
		var node = new Node(element);
		if(head === null) {
			head = node;
		}else {
			var traverseNode = head;
			while(traverseNode.next) {
				traverseNode = traverseNode.next;
			}
			traverseNode.next = node;
		}
		length++;
	}
	
	this.searchElementByValue = function() {
		var element = document.getElementById("element").value;
		var traverseNode = head;
		var index = 0;
		do{
			if(traverseNode.element == element) {
				return document.getElementById("result").innerHTML = "Element " +element + " is on " +index +"index";
			}
			else{
				traverseNode = traverseNode.next;
				index++;
			}
		}while(traverseNode);
		return -1;
	}
	
	this.searchElementByIndex = function() {
		var index = document.getElementById("element").value;
		var traverseNode = head;
		if(index < 0 || index >= length) {
			return document.getElementById("result").innerHTML = "Index is not valid";
		}
		if(index == 0) {
			return document.getElementById("result").innerHTML = "value on index is " +traverseNode.element;
		}
		while(index) {
			traverseNode = traverseNode.next;
			index--;
		}	
		return document.getElementById("result").innerHTML = "value on index is " +traverseNode.element;
	}
	
	this.removeElementByValue = function() {
		var element  = document.getElementById("element").value;
		var currentNode = head;
		var previousNode;
		if(currentNode.element == element){
			head = currentNode.next;
		}
		else{
			while(currentNode.next) {
				previousNode = currentNode;
				currentNode = currentNode.next;
				if(currentNode.element == element) {
					previousNode.next = currentNode.next;
					document.getElementById("result").innerHTML = "Deleted " +element;
					var flag = true;
				}
			}if(flag!=true) {
				document.getElementById("result").innerHTML = "value not found";
			}
			
		}
		length--;
	}
	
	this.removeElementByIndex = function() {
		var index = document.getElementById("element").value;
		var currentNode = head;
		var previousNode;
		if(index < 0 || index >= length) {
			return document.getElementById("result").innerHTML = "Index is not valid";
		}
		if(index==0) {
			head = currentNode.next;
		}else {
			while(index) {
				previousNode = currentNode;
				currentNode = currentNode.next;
				index--;
			}
			previousNode.next = currentNode.next;
		}
		
		length--;
	}
	
	this.display = function() {
		var traverseNode = head;
		var string = "";
		while(traverseNode) {
			//var data = traverseNode.element;
			string += traverseNode.element + " ";
			traverseNode = traverseNode.next;
		}
		document.getElementById("result").innerHTML = string ;
	}
	
	this.isEmpty = function() {
		return length===0;
	}
};

var list = new SinglyLinkedList();