package com.camparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Solution1 {

	public static void main(String[] args) 
	{
		TreeSet <Student> t = new TreeSet<Student>();
		t.add(new Student("tom"));
		t.add(new Student("bom"));
		t.add(new Student("don"));
		for(Student s : t)
			System.out.println(s);
		System.out.println("--------------");
		ArrayList <Student> l1 = new ArrayList<Student>();
		l1.add(new Student("A"));
		l1.add(new Student("D"));
		l1.add(new Student("B"));
		Collections.sort(l1);
		for(Student s1 : l1)
		{
			System.out.println(s1);
		}

	}
	
}
