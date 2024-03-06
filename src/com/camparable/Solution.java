package com.camparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Solution 
{
  public static void main(String[] args)
  {
	TreeSet <Car> t = new TreeSet<Car>();
	t.add(new Car(34000));
	t.add(new Car(12000));
	t.add(new Car(10000));
	for(Car c : t)
	{
		System.out.println(c);
	}
	System.out.println("---------------------");
	ArrayList <Car> al = new ArrayList<Car>();
	al.add(new Car(90000));
	al.add(new Car(80000));
	al.add(new Car(567489));
	Collections.sort(al);
	for(Car c1 : al)
	System.out.println(c1);
  }
}
