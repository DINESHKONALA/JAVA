package com.a.collections.VECTOR;

import java.util.Vector;

public class IncrementationInVector 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vector<String> i = new Vector<>();
		System.out.println("array = " + i);
		System.out.println("size = " + i.size()); // Size is count of element in array
		System.out.println("capacity = " + i.capacity()); // capacity is length of a array
		System.out.println();
			
		i.add("nami");
		i.add("Genesis");
		i.add("Exodus");
		i.add("Leviticus");
		i.add("Numbers");
		i.add("deuteronomy");
		i.add("Jouhua");
		i.add("Judges");
		i.add("Ruth");
		i.add("1 Samuel");
		System.out.println("array = " + i);
		System.out.println("size = " + i.size());
		System.out.println("capacity = " + i.capacity());
		System.out.println();
		
		i.add("2 Samuel");
		System.out.println("array = " + i);
		System.out.println("size = " + i.size());
		System.out.println("capacity = " + i.capacity());
		System.out.println();
		
		Vector<String> vector = new Vector<>(5 , 6); // 5 is initialCapacity and 6 is capacityIncrement
		System.out.println("array = " + vector);
		System.out.println("size = " + vector.size());
		System.out.println("capacity = " + vector.capacity());
		System.out.println();
		
		vector.add("1 kings");
		vector.add("2 Kings");
		vector.add("1 Chronicles");
		vector.add("2 chronicles");
		vector.add("Ezra");
		vector.add("Nehemiah");
		System.out.println("array = " + vector);
		System.out.println("size = " + vector.size());
		System.out.println("capacity = " + vector.capacity());

	}

}
