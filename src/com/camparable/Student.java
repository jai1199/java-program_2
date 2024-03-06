package com.camparable;

public class Student implements Comparable <Student>
{
  String name;
  public Student(String name)
  {
	  this.name = name;
  }
  @Override
  public String toString()
  {
	  return name;
  }
  @Override
  public int compareTo(Student s)
  {
	  return this.name.compareTo(s.name);
  }
}
