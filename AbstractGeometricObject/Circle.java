//Savannah Muniz

public class Circle extends AbstractGeometricObject implements Comparable{

	protected double radius;
	
	public Circle(){
		
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double getArea(){
		return Math.PI * (radius * radius);
	}
	public double getPerimeter(){
		return radius*2*Math.PI;
	}
	public double getDiameter(){
		return radius * 2;
	}
	
	@Override
	public boolean equals(AbstractGeometricObject o1) {
		boolean status;
		if (this.getArea() == o1.getArea())
			status = true;
		else status = false;
		
		return status;	
	}

	@Override
	public boolean isGreater(AbstractGeometricObject o1) {
		boolean status;
		if (this.getArea() > o1.getArea())
			status = true;
		else status = false;
		
		return status;	
	}

	@Override
	public boolean isLess(AbstractGeometricObject o1) {
		boolean status;
		if (this.getArea() < o1.getArea())
			status = true;
		else status = false;
		
		return status;	
	}
}
