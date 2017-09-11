//Savannah Muniz

public class Rectangle extends AbstractGeometricObject implements Comparable{

	protected double width, height;
	
	public Rectangle(){
		
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getArea(){
		return width * height;
	}
	public double getPerimeter(){
		return (2 * width) + (2 * height);
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
