package com.camparable;

public class Car implements Comparable <Car>
{
   int cost;
   public Car(int cost)
   {
	   this.cost = cost;
   }
   @Override
   public String toString()
   {
	   return "cost of car is "+cost;
   }
   @Override
   public int compareTo(Car c)
   {
	   return this.cost - c.cost;
   }
	
}
