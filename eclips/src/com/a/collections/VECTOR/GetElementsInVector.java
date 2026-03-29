package com.a.collections.VECTOR;
import java.util.Vector;
public class GetElementsInVector 
{
	public static void main(String[] args) 
	{
		Vector<String> g1 = new Vector<>();
		g1.add("Nehemiah");
		g1.add("Esther");
		g1.add("Job");
		g1.add("Psalms");
		g1.add("Proverbs");
		System.out.println(g1.get(1));
	}
}
