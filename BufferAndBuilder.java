/*here I'm trying to show how the capacity of a string buffer or string builder change if we use append*/
//string buffer is mutable means one can change the value of object,object created through stringbuffer is stored in heap
//stringbuilder class.stringBuilder objects are like string objects,except that they can be modified.internally
//stringbulider objects can be treated like variable length arrays thath contain a sequence of chaacters
//append means the characters of the string argument are appended,in order increasing the length of this sequence by length of the argument
package appendthestring; //created a package of appendthestring


public class BufferAndBuilder {//here created a class BufferAndBuilder
	                            //classes are the basics of opps(object oriented programming)
	                     //Here public is a access modifier which defines who can access this method
	
public static void main(String[] args) { //Here public is a access modifier which defines who can access this method
	

		
		//String Buffer and String builder have same method, but there is one difference between them. that is 
		// StringBuffer is synchronized that is thread safe. so, whenever you are working with thread then use
		// String buffer.
		
		StringBuffer buffer=new StringBuffer("vamshi"); //here created StringBuffer with variable buffer
		
		
		
		System.out.println("It gives the ouput has : " +buffer);  //it prints the string  
		System.out.println("The length is : "+buffer.length());   //here it prints the length of the string which is 14
		System.out.println("Capacity is : "+buffer.capacity());// here first the default  capacity is 16 and it adds to the given string capacity
		
		buffer.append(" The student of ACADGILD");    //this used to append the specified string with this string      
				
		System.out.println(buffer);
       
		System.out.println("The length is : "+buffer.length());//here the length will be 37
		System.out.println("Capacity is : "+buffer.capacity()); //now its capacity will become 62
		
		buffer.append(" Is here to Learn, Do and Earn");//appending
		
		System.out.println("Capacity is : "+buffer.capacity()); //gives the capacity of 126
       
		
		System.out.println(buffer);//system is used to return code
        //out is a static member
        //println is used to print text and gives output
       
		System.out.println("The length is : "+buffer.length()); //gives the length of 67
		System.out.println("Capacity is : "+buffer.capacity());// here it shows like now (62*2)+2=126 i.e (old capacity*2)+2
		//this is how the append uses the capacity of string buffer or string builder
        //println is used to print text and gives output
       
		
	}

}
