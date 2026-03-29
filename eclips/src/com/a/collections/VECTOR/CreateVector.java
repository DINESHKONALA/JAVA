package com.a.collections.VECTOR;
import java.util.Arrays;
import java.util.Vector;

public class CreateVector 
{
	public static void main(String [] abc)
	{
		// here we create vector without specifying data type
		// so we can add different data type
		Vector a = new Vector();
		a.add("nani");
		a.add(1);
		a.add(null);
		a.add(1);
		System.out.println(a);
		
		
		// creating a vector with specifying data type
		Vector<Integer> arr = new Vector<>(7); // here we specifying data type and capacity
		//to specify data type we can use only warper classes
		arr.add(1);
		arr.add(null);
		arr.add(1);
		arr.add(3);
		arr.add(2);
		System.out.println(arr.capacity());
		System.out.println(arr);
		
		Object[] array1 = new Object[] { 1,2,3,4,5,6,7,8,9};
		Vector a1 = new Vector(Arrays.asList(array1));
		System.out.println(a1);
		System.out.println(a1.capacity());
		
		
		
	}
}
