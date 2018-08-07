package oopsconcepts;

public class Car {
	//color
	private String color;
	
	//make
	private String make;
	//model
	private String model;
	//year
	private int year;
	
	public void increaseSpeed() {
		System.out.println("increase speed");
	}
public void setMake(String make) {
	this.make = make;
}
public String getMake() {
	return this.make;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) { ////////////////assign the value
	if (year > 1900) {
	this.year = year;
} else {
	System.out.println("this year is not valid");
}

}}

