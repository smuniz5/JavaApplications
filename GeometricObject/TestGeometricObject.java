//Savannah Muniz

public class TestGeometricObject {
	public static void main(String[] args){
		
		Circle c = new Circle(10);
		Rectangle r = new Rectangle(20, 30);
		
		c.setColor("black");
		r.setFilled(true);
		
		System.out.println("Circle");
		System.out.println(c.toString());
		System.out.println("Area: "+c.getArea());
		System.out.println("Perimeter: "+c.getPerimeter());
		
		System.out.println();
		System.out.println("Rectangle");
		System.out.println(r.toString());
		System.out.println("Area: "+r.getArea());
		System.out.println("Perimeter: "+r.getPerimeter());
	}
}
