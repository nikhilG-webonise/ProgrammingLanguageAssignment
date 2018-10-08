Language Name- Java
Why- 1) Java is simple Programming Language. It is easy to understand. I can say that java is base lang. before learning any new language.
     2) Java is OOPL i.e,(Object Oriented Programming language). objects have a unique identity, encapsulate attributes and operations, and are instances of classes 		related by inheritance and polymorphism.
     3) Java is compiled to bytecode. and this bytecode can be execute in any platform, that's why java is platform independent language.
     4) Java is an interpreted language, it was designed to support “just-in-time” compilers, which dynamically compile bytecodes to machine code.
     5) Java supports multiple threads of execution (lightweight processes), including a set of synchronization primitives. This makes programming with threads 	much easier. 
     6) Java supports dynamic loading of classes (load on demand), dynamic compilation, and memory management (garbage collection).

Program-

//All collection interfaces and classes are presented in util package. like List,Map. ArrayList implements List(interface). List extends Collection(Interface), and Collection exetends Iterable(interface).

import java.util.*;

//In java, class is template which is used to create objects, and to define object data types and methods. 
class Assignment
{
	public static void main(String args[])  //In java, code will start executing from main method
	{
	  ArrayList Arr=new ArrayList(); //Creating Object of ArrayList by using new Keyword with name Arr
	  //adding elements into arraylist
	  Arr.add(10);                   //ArrayList provided add method to insert an element. It will add 10 first
	  Arr.add("Nikhil");		 //second Nikhil String will be added
	  Arr.add('a');			 //third 'a' character will be added
	  System.out.println(Arr);	//this will print an output: [10,Nikhil,a] (Note: insertion order is maintain,This is non generic type example which is not 						  depend upon specific data type)
	  ArrayList<Integer> array=new ArrayList<Integer>();  //Creating an object of arraylist with primitive data type (i.e, Generic) with name array
	  array.add(10);		//first 10 will get added
	  array.add(20);		//second 20 will get added
	 /* array.add("Nikh"); */  	//this will give you an error because of generic i.e, given input is in string
	  System.out.println(array);   	//this will print an output:[10,20]
	  
	  //PROBLEM STATEMENT: FINDING AN INDEX OF STRING EX.APPLE

	  	ArrayList<String> fruits=new ArrayList<String>(); 	//Creating an object of arraylist with String data type (generic) with name fruits
	  	String fruitname="apple";			//Creating an String and storing value into variable fruitname and value is apple (for comparison)
	  	fruits.add("banana");				//first banana is added	
	  	fruits.add("pinaple");				//second pinaple is added
	  	fruits.add("watermelon");			//third watermelon is added
	  	fruits.add("apple");				//fourth apple is added
	  	fruits.add("mango");				//fifth mango is added
	  	for(int index=0;index<fruits.size();index++)	//creating for loop for traversing of arraylist. index will start from 0 to size of an arraylist
	  	{						//size of arraylist means total elements present into arraylist. index of arraylist start from 0
	    	     String fruitValue=fruits.get(index);	//arraylist provide get method which will returns the element at the specified position in this list.
							//index(as parameter)-The index of the element to return.
   	     	     if(fruitValue.equals(fruitname))	//checking an element fruivalue with defined string fruitname. String provide equal method for comparison 									//of content and return true or false according to given conditions. if condtion is true then 
	     	     {
			System.out.println("Index of apple fruit is:"+index);  //this will print an index. Output(Index of apple fruit is:4
			System.out.println("Index of apple fruit by using indexOf:"+fruits.indexOf("apple"));  //this will return index 3 if present and if not it'll 														       //return -1
 	     	     }
	     	     else	//this is for if condtion is not true, so what shoud be output to be shown or print
	     	     {
 		        System.out.println("Fruit is not present at index:"+index); //this will print no index because no fruit is present in arraylist
	             }
     	  	} 
		//I've used for loop because it is simplest way to find index. for this if i use Iterator then it'll be more complex. 
		//there is also indexOf method in arraylist which will take element as parameter and return index if element is present and return -1 if not present	 
 	}
}

	//Execution for Problem statement findind an index of element

	Every execution start from main method. public is access specifier. 
	static is keyword. When java runtime starts, there is no object of the class present. That’s why the main method has to be static so that JVM can load the class into memory and call the main method. 
	In java programming mandates that every method provide the return type. Java main method doesn’t return anything, that’s why it’s return type is void.
	This is the name of java main method. It’s fixed and when we start a java program, it looks for the main method. 
	otherwise it'll throw an error that the main method is not found.
	Java main method accepts a single argument of type String array. This is also called as java command line arguments.
	*Features of ArrayList:
	A)ArrayList is a re-sizable array, also called a dynamic array.
     	B)ArrayList internally uses an array to store the elements. Just like arrays, It allows you to retrieve the elements by their index.
    	C)Java ArrayList allows duplicate and null values. and also it maintain insertion order.
     	D)ArrayList is also known as dynamic array because It grows its size to accommodate new elements and shrinks(re-size) the size when the elements are removed.
	
	Steps:1)Creating an object of arraylist
	2)Create string as input which will be used for comparison and finding index of this input string ex.apple
	3)adding fruits name into arraylist i.e, [banana,piaple,watermelon,apple,mango]
	4)Using for loop,
	  a)Intializing variable with 0 and data type is int (Arraylist index start from 0)
	  b)this will run till arraylist_size-1 (i.e, totalelements present in arraylist) 
	  c)Increment of index value (it will execute till condition is satify)i i.e, conditin is index<arraylist_size=5
	5) for index=0
		String fruitname=apple;
 		String fruitvalue=banana;
		if(banana.equals(apple) :false
		else print:Fruit is not present at index:0
	6) for index=1
		String fruitname=apple;
 		String fruitvalue=piaple;
		if(banana.equals(apple) :false
		else print:Fruit is not present at index:1
	7) for index=2
		String fruitname=apple;
 		String fruitvalue=watermelon;
		if(watermelon.equals(apple) :false
		else print:Fruit is not present at index:2
	8) for index=3
		String fruitname=apple;
 		String fruitvalue=apple;
		if(apple.equals(apple) :true
		print:Index of apple fruit is:3
		print:Index of apple fruit by using indexOf:fruits.indexOf("apple")=3
	9) for index=4
		String fruitname=apple;
 		String fruitvalue=mango;
		if(mango.equals(apple) :false
		else print:Fruit is not present at index:4
