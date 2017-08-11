function Queue() {
	this.newIndex = 1;
	this.oldIndex = 1;
	this.storage = {};
}

Queue.prototype.enqueue = function() {
	var element = document.getElementById("element").value;
	document.getElementById("element").value = "";
	this.storage[this.oldIndex] = element;
	this.oldIndex--;
	document.getElementById("result").innerHTML = objQueue.display().value;
}

Queue.prototype.dequeue = function() {
	var deletedElement;
	if(this.oldIndex != this.newIndex) {
		deletedElement = this.storage[this.newIndex];
		delete this.storage[this.newIndex];
		this.newIndex--;
		document.getElementById("result").innerHTML = objQueue.display().value;
	}else {
		return document.getElementById("result").innerHTML = "Queue underflow";
	}	
}
Queue.prototype.lengthOfQueue = function(){
	return document.getElementById("result").innerHTML = this.newIndex - this.oldIndex;
}
Queue.prototype.display = function(){
	var tempOldIndex = this.oldIndex + 1;
	var string = " ";
	while(tempOldIndex <= this.newIndex) {
		string += (this.storage[tempOldIndex]) + " ";
		tempOldIndex++;
	}
	document.getElementById("result").innerHTML = string;
}
var objQueue = new Queue();