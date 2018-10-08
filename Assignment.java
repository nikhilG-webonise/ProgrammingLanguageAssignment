import java.util.*;
public class Assignment{
public static void main(String args[])  { 
    ArrayList Arr=new ArrayList(); 
    Arr.add(10); 
    Arr.add("Nikhil"); 
    Arr.add('a'); 
    System.out.println(Arr); 
    ArrayList array=new ArrayList();
    array.add(10); 
    array.add(20); 
    array.add("Nikh"); 
    System.out.println(array); 

  	ArrayList<String> fruits=new ArrayList<String>(); 	
  	String fruitname="apple";		
  	fruits.add("banana");					
  	fruits.add("pinaple");				
  	fruits.add("watermelon");			
  	fruits.add("apple");				
  	fruits.add("mango");
  	for(int index=0;index<fruits.size();index++)
  	{						
    	     String fruitValue=fruits.get(index);	
     	     if(fruitValue.equals(fruitname))	 
     	     {
		        System.out.println("Index of apple fruit is:"+index); 
		        System.out.println("Index of apple fruit by using indexOf:"+fruits.indexOf("apple"));
     	     }
     	     else	
     	     {
	            System.out.println("Fruit is not present at index:"+index); 
	     }
 	 } 
    }
}
