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
import java.util.Scanner;
import java.util.ArrayList; 

public class Main  {
    public static void main(String[] args){
        //variables
        String boatName;  //the name of a boat
        int boatYear;   //the year the boat was made
        int maxPassengers;  //max number of passengers
        int maxWeight;  //max weight of a single boat
        
        //declare new Fleet of Boats object
        Fleet myFleet = new Fleet();
        
        //add a scanner
        Scanner input = new Scanner(System.in);
        
        //welcome application message
        System.out.println("Welcome to the Boat Fleet Application");
        System.out.println("Let's begin by adding the information of the first"
                + " boat.");
        System.out.println(" ");
        
        /**test for superclass Boat data**/
        
        //test getters with user input
       System.out.println("Enter boat name: ");
       boatName = input.nextLine();
       System.out.println("Enter the year the boat was built: ");
       boatYear = input.nextInt();
       Boat boat = new Boat(boatName, boatYear); 
       boat.getName();
       boat.getYearBuilt(); 
       System.out.println("Here is what you currently entered: ");
       System.out.println(boat.toString());
       System.out.println("");
       
       System.out.println("Previously entered boat information: ");
        //test setters using hard-coded data
        boat.setName("Maria");        
        boat.setYearBuilt(1985);
        System.out.println(boat.toString()); 
        System.out.println("This is a sailboat.");
        
        /**test for subclass SailBoat data**/
        
        //test getters
        System.out.println(" ");
        System.out.println("Now let's enter sailboat information.");
        System.out.println("Enter the maximum number of passengers allowed on"
                + " this boat: ");
        maxPassengers = input.nextInt();
        SailBoat sailboat = new SailBoat(boat.getName(), boat.getYearBuilt(),
                maxPassengers);
        System.out.println("Boat Name: " + boat.getName() + "\n" +
                "Year Built: " + boat.getYearBuilt()+ "\n" +
                "Maximum Passengers: " + sailboat.getPassengers());
        
        //to test setters for sailboat class
        System.out.println("Here is another sailboat in the fleet.");
        boat.setName("The Murphy");
        System.out.println("Boat Name: " + boat.getName());               
        sailboat.setPassengers(6);
        System.out.println("Max Passengers: " + sailboat.getPassengers());
        System.out.println("Previously entered sailboat information: ");
        System.out.println(sailboat.toString());
        
        /**test for subclass TugBoat data**/
        
        //test getters and setters
        System.out.println(" ");
        System.out.println("It appears you have a tugboat in your fleet"
                + " as well.\n");
        boat.setName("Theodore");
        System.out.println("Boat Name: " + boat.getName()); 
        boat.setYearBuilt(1989);
        System.out.println("Year Buil: " + boat.getYearBuilt());
        System.out.println("Input the max weight this boat can hold: ");
        maxWeight = input.nextInt();
        TugBoat tugBoat = new TugBoat(boat.getName(), boat.getYearBuilt(),
                            maxWeight);
        System.out.println("The tugboat information entered: ");
        System.out.println(tugBoat.toString());
        System.out.println(" ");
        
        /**test Fleet class data**/
        
        //add a Boat to the Fleet
        myFleet.addBoat(new Boat("LittleMinnow", 1960));
        myFleet.addBoat(new SailBoat("The Vrowenvelder", 2006, 6));
        myFleet.addBoat(new TugBoat("Theodore", 1989,58));
        System.out.println("This is the current Fleet List: ");
        System.out.println(myFleet.getFleet());
        System.out.println(" ");
              
        //remove a boat from the fleet--hardcoded test data
        myFleet.removeBoat("LittleMinnow", 1960);
        System.out.println("Little Minnow was removed.");
        System.out.println(" ");
        
        //get the new Fleet List
        System.out.println("This is the new Fleet List:");
        System.out.println(myFleet.getFleet()); 
        
        
                
}
}//END main method

