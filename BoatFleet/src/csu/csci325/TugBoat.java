/*
 * STUDENT NAME: Dondra Crocker Richards
 * PROGRAM NAME: TugBoat.java
 * PURPOSE: To store data about a boat that carries weighted cargo
 * Creation Date: October 04, 2018
 * LastModified Date: November 16, 2108
 * CSCI Course: CSCI - 325 Object Oriented Programming
 * Grade Received: A
 * Comments Regarding Design: This program was developed using Java SE8. It is
 *                            designed to be run in the console. An executable
 *                            jar file has been added to the GitHub repository.
 */
 
package csu.csci325;

public class TugBoat extends Boat{
    //private variable declarations
    private int maxTons;
    
    //constructor
    public TugBoat(String n, int y, int t){
        super(n, y);
        this.maxTons = t;        
    }
    
    /**METHODS**/
    //to set the maximum weight of cargo in tons
    public void setCapacity(int t){
        this.maxTons = t;
    }
    
    //to return the maximum weight of cargo
    public int getCapacity(){
        return this.maxTons;
    }
    
    //to return the information entered as a string to the user
    @Override
    public String toString(){
        String str = "TugBoat Name: " + super.getName() +
                "\nCargo capacity: " + this.maxTons + " tons";
        return str;
    }    
    
}
