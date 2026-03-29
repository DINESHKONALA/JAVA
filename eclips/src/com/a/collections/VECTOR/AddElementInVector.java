package com.a.collections.VECTOR;
//import VECTOR*;
import java.util.Vector;
public class AddElementInVector 
{
	public static void main(String [] abc)
	{
		Vector<Integer> A1 = new Vector<>();
		A1.add(1);
		System.out.println("array A1 = " + A1);
		
		A1.add(0 , 10); // here we indexing the value. "0" is index value and "10" is value
		System.out.println("array A1 = " + A1);
		
		Vector<Integer> B1 = new Vector<>();
		B1.add(null);
		B1.addAll(A1); // here we are adding A1 elements in B1 vector
		System.out.println("array B1 = " + B1);
		B1.addAll(0 , A1); // here we are adding A1 elements in B1 vector with specifying index value 
		System.out.println("array B1 = " + B1);

		
		
		
	}
}
