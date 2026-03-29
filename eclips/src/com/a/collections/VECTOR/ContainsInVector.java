package com.a.collections.VECTOR;

import java.util.Vector;

public class ContainsInVector 
{
	public static void main(String[] args) 
	{
		Vector<String> c = new Vector<>();
		c.add("Ecclesiastes");
		c.add("song of songs");
		c.add("isaiah");
		
		Vector<String> c1 = new Vector<>();
		c1.addAll(c);
		c1.add("jermiah");
		c1.add("lamentation");
		c1.add("Ezekiel");
		
		System.out.println(c1);
		
		System.out.println(c1.contains("jermiah")); // it checks the element is present in vector or not and gives the output true or false
		
		System.out.println(c1.containsAll(c)); // it can check the given vector elements is present in vector or not
	}
}
