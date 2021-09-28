package courseraJava1;

public class Point {
	private int x;
	private int y;

	public Point(int startx, int starty) {

		this.x = startx;
		this.y = starty;
	}

	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}
	public double distance(Point otherPt) {
		
	int  dx = x-otherPt.getX();
	int dy = y-otherPt.getY();
		return Math.sqrt(dx*dx+dy*dy) ;
		
	}
	
	
	
	public static void main(String[] args) {
		Point p1= new Point(-3,2);
		Point p2 =new Point(7,5);
		
		System.out.println(p1.distance(p2));
	}

}
