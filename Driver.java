package com.Java;

import java.util.Scanner;

public class Driver {

	    public static void main(String[] args) {
	    	Scanner scnr = new Scanner(System.in);
	        // Instance variables
	    	String name;
		    String type;
		    String gender = null;
		    int age = 0;
		    float weight = 0;
		    float tailLength = 0;
		    float height;
			float bodyLength;
			String species = null;
			float measurementOfTorso;
			float measurementOfSkull;
			float measurementOfNeck;
			
	    	// Create New Dog
	    	Dog dog1 = new Dog();
	    	


	        // Create New Monkey
	    	Monkey monkey1 = new Monkey();
	    	
	        // Method to process request for a rescue animal
	        // Method(s) to update information on existing animals

	    	
	    	
	    	
	        // Method to add animals
	    
	   		System.out.println("Name of the animal?");
	    	name = scnr.next();
	    	
	    	System.out.println("Input YES if the animal is a monkey or NO if the animal is a dog.");
	    	type = scnr.next();
	    	
    	    //if YES is typed then the monkey information will be inputed
	    	String newMonkey = scnr.next();
	    	 if (newMonkey.equals("YES")) {
	    		System.out.println("What is the monkey's gender?");
	    			gender = scnr.next();
	    		System.out.println("What is the monkey's age?");
	    			age = scnr.nextInt();
	    		System.out.println("How much does the monkey weight?");
	    			weight = scnr.nextFloat();
	    		System.out.println("Input length of the monkey's tail?");
	    			tailLength = scnr.nextFloat();
	    		System.out.println("Input monkey's height.");
	    			height = scnr.nextFloat();
	    		System.out.println("Input monkey's body lenght.");
	    			bodyLength = scnr.nextFloat();
	    		System.out.println("What type of species is the monkey?");
	    			species = scnr.next();
	    		System.out.println("Input monkey's torso measurements.");
	    			measurementOfTorso = scnr.nextFloat();
	    		System.out.println("Input monkey's skull measurements");
	    			measurementOfSkull = scnr.nextFloat();
	    		System.out.println("Input monkey's neck measurements");
	    			measurementOfNeck = scnr.nextFloat();	
	    			
	    			//Prints out the monkey information sheet from the inputed data
	    			  System.out.println("Animal Information");
	    			  System.out.println("Animal Type: Monkey");
	    	    	  System.out.println("Name: " +name);
	    	    	  System.out.println("Species: " +species);
	    	    	  System.out.println("Gender: " +gender);
	    	    	  System.out.println("Age: " +age);
	    	    	  System.out.println("Tail Length: " +tailLength);
	    	    	  System.out.println("Height: " +height);
	    	    	  System.out.println("Torso Measurement: " +measurementOfTorso);
	    	    	  System.out.println("Skull Measurement: " +measurementOfSkull);
	    	    	  System.out.println("Neck Measurement: " +measurementOfNeck);
	    	 }
	    	 // If NO is typed, input dog information
	    	 String newDog = scnr.next();
	    	 if (newDog.equals("NO")) {
	    		System.out.println("What is the dog's gender?");
	    			gender = scnr.next();
	    		System.out.println("What is the dog's age?");
	    			age = scnr.nextInt();
	    		System.out.println("How much does the dog weight?");
	    			weight = scnr.nextFloat();
	    		System.out.println("What type of species is the dog?");
	    			species = scnr.next();
	    			
	    	 // Prints the dogs information that was inputed
	    	  System.out.println("Animal Information");
	    	  System.out.println("Animal Type: Dog");
	    	  System.out.println("Name: " +name);
	    	  System.out.println("Gender: " +gender);
	    	  System.out.println("Age: " +age);
	    	  System.out.println("Species: " +species);
	    	 }
	        // Method to out process animals for the farm or in-service placement
	    	 


	        // Method to display in-service animals



	        // Process reports from in-service agencies reporting death/retirement


	    	 
	    }
}



