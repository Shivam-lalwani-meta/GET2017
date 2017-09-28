function Stack(){
	this.top = 0;
	this.element = {};
}

Stack.prototype.push = function() {
	
	var value = document.getElementById("pushElement").value;
	if(value =="") {
		document.getElementById("result").innerHTML = "Please enter a value";
	} else{
		document.getElementById("pushElement").value= "";
		this.element[this.top] = value;
		this.top++;
		this.display();
	}
}

Stack.prototype.pop = function() {
	
	if(this.top==0) {
		return document.getElementById("result").innerHTML = "Stack is empty";
	}
	this.top--;
	var result = this.element[this.top];
	delete this.element[this.top];
	this.display();
}
Stack.prototype.display = function(){
	var count = this.top-1;
	var string = "start-> ";
	while(count != -1) {
		string += this.element[count] + "->";
		count--;
	}	
	string += "->end";
	document.getElementById("result").innerHTML = string;
}

var stackObj = new Stack();