
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
	
	this.addElement = function(){
		element = document.getElementById("addElement").value;
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
	
	this.searchElementByValue = function(element) {
		var traverseNode = head;
		var index = 0;
		do{
			if(traverseNode.element == element) {
				return index;
			}
			else{
				traverseNode = traverseNode.next;
				index++;
			}
		}while(traverseNode);
		return -1;
	}
	
	this.removeElementByValue = function(element) {
		var currentNode = head;
		var previousNode;
		if(currentNode.element == element){
			head = currentNode.next;
		}
		else{
			while(currentNode.element != element) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			previousNode.next = currentNode.next;
		}
		length--;
	}
	
	this.removeElementByIndex = function(index) {
		var currentNode = head;
		var previousNode;
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
	
	this.searchElementByIndex = function(index) {
		var traverseNode = head;
		while(index) {
			traverseNode = traverseNode.next;
			index--;
		}	
		return traverseNode.element;
	}
	
	this.display = function() {
		var traverseNode = head;
		while(traverseNode) {
			document.getElementById("result").innerHTML = parseInt(traverseNode.element);
			traverseNode = traverseNode.next;
		}
	}
	
	this.isEmpty = function() {
		return length===0;
	}
};

var list = new SinglyLinkedList();