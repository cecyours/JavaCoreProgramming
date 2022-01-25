
# Instance of Methods (types of method)

1.	instance method
	```java
		- object through call
		- normal method
	```
2. static
	```java
		- object through call
		- class through call
		- all elements in it's body parts must be static 
		- static keyword
		Example : 
		int a
		static void display()
		{
			s.o.p(a); // error bcz a is non-static
		}
	```
3. abstract
	```
		- static/ instance
		- no body part
		- you can't create object of abstarct class
		- force to re-define abstract method in child class 
	```