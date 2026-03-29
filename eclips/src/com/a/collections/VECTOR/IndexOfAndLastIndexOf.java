package com.a.collections.VECTOR;
import java.util.Vector;
public class IndexOfAndLastIndexOf 
{
	public static void main(String [] args)
	{
		Vector<String> i = new Vector<>();
		i.add("lamentations");
		i.add("Ezekiel");
		i.add("daniel");
		i.add("daniel");
		
		System.out.println(i);
		System.out.println("index of lamentations = " + i.indexOf("lamentations"));
		System.out.println("index of daniel = " + i.indexOf("daniel"));
		System.out.println("last index of daniel = " + i.lastIndexOf("daniel"));
	}
}
