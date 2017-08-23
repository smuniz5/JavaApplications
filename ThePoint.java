//Savannah Muniz

public class ThePoint {

	private int x, y;
	
	public ThePoint(){
		x = 0;
		y = 0;
	}
	
	public ThePoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public static double getDistance(ThePoint p1, ThePoint p2){
		return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
	}
}
