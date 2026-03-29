package com.a.collections.VECTOR;
import java.util.Vector;
public class SetElementInVector {

	public static void main(String[] args) {
		Vector<String> s = new Vector<>();
		s.add("job");
		s.add("jeremiah");
		System.out.println(s);
		s.set(0 , "Isaiah");
		System.out.println(s);
	}

}
