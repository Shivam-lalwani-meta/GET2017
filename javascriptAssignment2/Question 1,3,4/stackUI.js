function Stack(){
	this.top = 0;
	this.element = {};
}

Stack.prototype.push = function() {
	
	var value = document.getElementById("pushElement").value;
	document.getElementById("pushElement").value= "";
	this.element[this.top] = value;
	this.top++;
}

Stack.prototype.pop = function() {
	
	if(this.top==0) {
		return alert("Stack is empty");
	}
	this.top--;
	var result = this.element[this.top];
	delete this.element[this.top];
	return document.getElementById("result").innerHTML = result;
}
Stack.prototype.display = function(){
	var count = this.top-1;
	var string = " ";
	while(count != -1) {
		string += this.element[count];
		count--;
	}	
	document.getElementById("result").innerHTML = string;
}

var stackObj = new Stack();