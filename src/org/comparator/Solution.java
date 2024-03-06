package org.comparator;

import java.util.TreeSet;

public class Solution
{
   public static void main(String[] args) {
   TreeSet <Person> t = new TreeSet<Person>(new SortByAge());
   t.add(new Person(21));
   t.add(new Person(24));
   t.add(new Person(20));
   for(Person p :t)
	   System.out.println(p);
}
  	
}
