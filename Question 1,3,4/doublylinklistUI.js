function Node(value) {
    this.value = value;
    this.prev = null;
    this.next = null;
}

function DoublyLinkedList(){
    this.head = null;
    this.length = 0;
}

DoublyLinkedList.prototype.add = function(){
	var value = document.getElementById("element").value;
	if(value =="") {
		document.getElementById("result").innerHTML = "Please enter a value";
	}else{
		document.getElementById("element").value = "";
		var newNode = new Node(value);
		var currentNode = this.head;

		if(!this.head) {
			this.head = newNode;
		} else {
			while(currentNode.next) {
				currentNode = currentNode.next;
			}
			newNode.prev = currentNode;
			currentNode.next = newNode;
		}
		this.length++;
	}	
}



function getPromptData() {
    var position = prompt("Please enter position", "1").trim();
    while (!position.match("^[0-9]+$")) {
        position = prompt("Please enter Correct position", "1").trim();
    }
    
    return position;
}




DoublyLinkedList.prototype.addAtPosition = function () {
	var value = document.getElementById("element").value;
    var start = this.head;
    var newNode = new Node(value);
    var count = 1;
    var maxLength = this.length + 1;
	var position = prompt("Please enter position", "1").trim();
    if (position > maxLength || position < 1) {
        console.log("Invalid Position");
    }
    else if (position == 1) {
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
        console.log("Added Successfully at position 1");
    } else {
        while (count != position - 1) {
            start = start.next;
            count++;
        }
        newNode.next = start.next;
        newNode.previous = start;
        start.next = newNode;
        this.length++;
        this.display();
    }
}






function addValueByPosition() {
    var inputObj = document.getElementById("inputValue");
    var value = inputObj.value.trim();
    var flag = checkInput(value);
    if (flag === true) {
        var position = getPromptData();
        displayMessage(obj.addAtPosition(value, position));
        displayLinkedList();
    } else {
        displayMessage("Enter Value");
    }
    clearInputField(inputObj);
}









DoublyLinkedList.prototype.removeByIndex = function() {
	var indexLocation = prompt("Please enter position", "1").trim();
    if(this.isEmpty()){
        return;
    }
    if(indexLocation < 1 || indexLocation > this.length){
        console.log("Enter valid index to delete");
        return;
    }
    var currentNode = this.head;
    var count = 1;
    if(indexLocation == 1) {
        this.head=currentNode.next;
        currentNode = null;
        this.length--;
        return;
    }
    
    while(count < indexLocation) {
        currentNode = currentNode.next;
        count++;
    }

    if(indexLocation == this.length) {
        currentNode.prev.next = null;
        currentNode = null;
        this.length--;  
        return;  
    }

    currentNode.prev.next = currentNode.next;
    currentNode.next.prev = currentNode.prev;
    currentNode = null;
    this.length--;

}

// function hoisting is depicted here
DoublyLinkedList.prototype.isEmpty = function(){
    if(!this.head) {
        document.getElementById("result").innerHTML = "List is empty";
        return true;
    } else {
        return false;
    }
}

DoublyLinkedList.prototype.display = function() {
    if(this.isEmpty()){
        return;
    }
	var string = "";
    var currentNode = this.head;
    while(currentNode) {
        string += currentNode.value+"<-->";
        currentNode = currentNode.next;
    }
	document.getElementById("result").innerHTML = string;
}

DoublyLinkedList.prototype.removeByValue = function() {
	var valueToRemove = document.getElementById("element").value;
    if(this.isEmpty()){
        return;
    }
    var currentNode = this.head;
    if(currentNode.value == valueToRemove) {
        this.head = currentNode.next;
        currentNode = null;
        this.length--;
        return;
    }
    while(currentNode.value !== valueToRemove && currentNode.next) {
        currentNode = currentNode.next;
    }

    if(!currentNode.next && currentNode.value===valueToRemove){
        currentNode.prev.next = null;
        currentnode = null;
        this.length--;
        return;
    } else if(!currentNode){
        document.getElementById("result").innerHTML = "element not in the list";
        return;
    }
    currentNode.prev.next = currentNode.next;
    currentNode.next.prev = currentNode.prev;
    this.length--;
}
var list = new DoublyLinkedList();