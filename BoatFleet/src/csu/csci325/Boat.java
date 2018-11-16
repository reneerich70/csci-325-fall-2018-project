/*
 * STUDENT NAME: Dondra Crocker Richards
 * PROGRAM NAME: Boat.java
 * PURPOSE: To store data about a single boat
 * Creation Date: October 04, 2018
 * LastModified Date: November 16, 2108
 * CSCI Course: CSCI - 325 Object Oriented Programming
 * Grade Received: A
 * Comments Regarding Design: This program was developed using Java SE8. It is
 *                            designed to be run in the console. An executable
 *                            .jar file has been added to the GitHub repository.
 */
 
package csu.csci325;

public class Boat {
    private String nameOfBoat;     //represents the name of the boat
    private int yearBuilt;       //represents the year the boat was manufactured
    public Boat(String n, int y){
        nameOfBoat = n;
        yearBuilt = y;        
    }
    
    //method to get the name of the boat
    public String getName(){
        return nameOfBoat;
    }
    public int getYearBuilt(){
        return yearBuilt;
    }
    public void setName(String n){
        this.nameOfBoat = n;
    }
    public void setYearBuilt(int y){
        this.yearBuilt = y;
    }
    @Override
    public String toString(){
        String str = "Boat Name: " + nameOfBoat +
                     "\nYear built: " + yearBuilt;
        return str;
    }
}

