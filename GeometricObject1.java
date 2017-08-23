//Savannah Muniz

import java.util.*;

public class GeometricObject1 {

	protected String color = "white";
	protected boolean filled = false;
	Date dateCreated = new Date();
	
	public GeometricObject1(){
		
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public boolean isFilled(){
		return filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public Date getdateCreated(){
		return dateCreated;
	}
	public String toString(){
		return "Color: "+color+"\nFilled: "+filled+"\nDate Created: "+dateCreated;
	}
}
