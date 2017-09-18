//Savannah Muniz

public class TestAbstractGeometricObject {

	public static void main(String[] args){
		
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(1, 200);
		Circle c1 = new Circle(1000);
		Circle c2 = new Circle(500);
		
		System.out.println("When comparing r1 to c1: ");
		if(r1.equals(c1)){
			System.out.println("The areas of r1 and c1 are equal.");
		}
		if(r1.isGreater(c1)){
			System.out.println("The area of r1 is greater than the area of c1.");
		}
		if(r1.isLess(c1)){
			System.out.println("The area of r1 is less than the area of c1.");
		}
		
		System.out.println();
		
		System.out.println("When comparing r1 to r2: ");
		if(r1.equals(r2)){
			System.out.println("The areas of r1 and r2 are equal.");
		}
		if(r1.isGreater(r2)){
			System.out.println("The area of r1 is greater than the area of r2.");
		}
		if(r1.isLess(r2)){
			System.out.println("The area of r1 is less than the area of r2.");
		}
		
		System.out.println();
		
		System.out.println("When comparing c1 to c2: ");
		if(c1.equals(c2)){
			System.out.println("The areas of c1 and c2 are equal.");
		}
		if(c1.isGreater(c2)){
			System.out.println("The area of c1 is greater than the area of c2.");
		}
		if(c1.isLess(c2)){
			System.out.println("The area of c1 is less than the area of c2.");
		}
	}
}
	
