package com.Java;
//Inherit from the RescueAnimal class using extends
public class Monkey extends RescueAnimal {
	public enum Species{Capuchin, Guenon, Macaque, Marmoset, Squirrel, Tamarin}
	//Variables are public and shared with other class
	public float tailLength;
	public float height;
	public float bodyLength;
	public String species;
	public float measurementOfTorso;
	public float measurementOfSkull;
	public float measurementOfNeck;
	
	//Constructor
	public Monkey() {
	}
	
	//Accessor methods are used to get the values for all implemented attributes
	public float getTailLength() {
		return tailLength;
	}
	public float getHeight() {
		return height;
	}
	public float getBodyLength() {
		return bodyLength;
	}
	public String getSpecies() {
		return species;
	}
	public float getMeasurementOfTorso() {
		return measurementOfTorso;
	}
	public float getMeasurementOfSkull() {
		return measurementOfSkull;
	}
	public float getMeasurementOfNeck() {
		return measurementOfNeck;
	}
	
	//Mutator methods are used for all implemented attributes
	public void setTailLength(float tailLength) {
		this.tailLength = tailLength;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setBodyLength(float bodyLength) {
		this.bodyLength = bodyLength;
	}
	public void setMeasurementOfTorso(float measurementOfTorso) {
		this.measurementOfTorso = measurementOfTorso;
	}
	public void setMeasurementOfSkull(float measurementOfSkull) {
		this.measurementOfSkull = measurementOfSkull;
	}
	public void setMeasurementOfNeck(float measurementOfNeck) {
		this.measurementOfNeck = measurementOfNeck;

	}
}



