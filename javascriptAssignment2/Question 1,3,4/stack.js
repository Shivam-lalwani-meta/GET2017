function Stack(){
	this.top = 0;
	this.element = {};
}

Stack.prototype.push = function(value) {
	
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
	return result;
}
Stack.prototype.display = function(){
	var count = [this.top];
	while(count!=-1) {
		console.log(this.element[count]);
		count--;
	}	
}