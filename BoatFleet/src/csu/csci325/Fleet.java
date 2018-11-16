/*
 * STUDENT NAME: Dondra Crocker Richards
 * PROGRAM NAME: Fleet.java
 * PURPOSE: To store data about a fleet of boats using an ArrayList to remove,
 *          retrieve, and add boats to the fleet.
 * Creation Date: October 04, 2018
 * LastModified Date: November 16, 2108
 * CSCI Course: CSCI - 325 Object Oriented Programming
 * Grade Received: A
 * Comments Regarding Design: This program was developed using Java SE8. It is
 *                            designed to be run in the console. An executable
 *                            .jar file has been added to the GitHub repository.
 */
package csu.csci325;
import java.util.ArrayList;

public class Fleet {
   private ArrayList<Boat> boats;
   public Fleet(){
       boats = new ArrayList<>();              
   }
   
   /**METHODS**/
   //get ArrayList of Boat objects
   public ArrayList<Boat> getFleet(){
       return boats;
   }
   
   //adds a Boat object to the fleet 
   public void addBoat(Boat b){
       boats.add(b);
   }
   
    //returns the first Boat object with the name and year
   public Boat getBoat(String name, int year){
      return boats.get(0);      
   }   
   //to remove the first boat object with the given name and year
   public void removeBoat(String name, int year){
       boats.remove(0);
   }    
}

