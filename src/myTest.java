//Name:			Roby Bearden
//Class:		CS 3305/Section 3
//Term:			Spring 2023
//Instructor:	Prof. Majeed
//Assignment:	2

import java.util.Scanner;

public class myTest
{
   public static void main (String[] args)
   {
      LinkedList myList = new LinkedList(); //create a list object
   
      for (int i=1; i <= 5; i++) //add 5 nodes to the list
      {
         myList.addLastNode(i*10);
      } 
      
      //print out the list content
      System.out.print("My test list values are:  ");
      myList.printList();
      System.out.println(); 
      System.out.println(myList.countNodes());
   } 
}
    
