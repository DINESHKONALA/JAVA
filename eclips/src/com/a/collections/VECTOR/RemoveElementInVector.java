package com.a.collections.VECTOR;
import java.util.Vector;
public class RemoveElementInVector 
{
	public static void main(String[] args) 
	{
		Vector<String> r = new Vector<>();
		r.add("moses");
		r.add("bezalel");
		r.add("esther");
		Vector<String> r1 = new Vector<>();
		r1.addAll(r);
		r1.add("oholiab");
		r1.add("arron");
		r1.add("ruth");
		System.out.println(r1);
		
		r1.remove(0); // here we remove element by specifying index value
		System.out.println("here we remove elements by using index value = " + r1);
		
		r1.remove("arron"); // here we remove elements by specifying index value
		System.out.println("here we remove elements by using elements = " + r1);
		
		r1.removeAll(r); // here to remove entire vector elements we use removeAll()
		System.out.println("here we remove elemnts by using vector = " + r1);
		
		r1.clear(); // by using clear() we can remover entire elements in vector
		System.out.println("here we clear entire elements in vector = " + r1);
	}
}
