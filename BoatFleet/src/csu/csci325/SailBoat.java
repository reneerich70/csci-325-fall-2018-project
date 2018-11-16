/*
 * STUDENT NAME: Dondra Crocker Richards
 * PROGRAM NAME: SailBoat.java
 * PURPOSE: To store information about a sailboat and the number of passengers
 *          it can carry
 * Creation Date: October 04, 2018
 * LastModified Date: November 16, 2108
 * CSCI Course: CSCI - 325 Object Oriented Programming
 * Grade Received: A
 * Comments Regarding Design: This program was developed using Java SE8. It is
 *                            designed to be run in the console. An executable
 *                            jar file has been added to the GitHub repository.
 */
 
package csu.csci325;

public class SailBoat extends Boat {
    
    //private variable declarations
    private int passengers;
    //constructor
            public SailBoat(String n, int y, int p){
                super(n, y);                
                this.passengers = p;
               
            }
            /**METHODS**/
            
            //set the maximum number of passengers a boat can carry
            public void setPassengers(int p){
                this.passengers = p;
            }
            
            //return the maximum number of passengers
            public int getPassengers(){
                return this.passengers;
            }
            
            //returns a string of the boat name and the max number of passengers
            @Override
            public String toString(){
                String str = "SailBoat Name: " + super.getName() + 
                        "\nMaximum passengers: " + passengers;
                return str;
            }
}
