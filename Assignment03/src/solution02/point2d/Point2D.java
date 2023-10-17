package solution02.point2d;


public class Point2D {
	private double x;
	private double y;
	public Point2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
        return "Point(" + x + ", " + y + ")";
    }
	
    public boolean isEqual(Point2D otherPoint) {
    	if(this.x == otherPoint.x && this.y == otherPoint.y) {
    		return true;
    	} else {
    		return false;
    	}    
    }
    
    public double calculateDistance(Point2D anotherPoint) {
        double Xsquare = this.x - anotherPoint.x;
        double Ysquare = this.y - anotherPoint.y;
        double distance = Math.sqrt(Xsquare * Xsquare + Xsquare * Xsquare);
        return distance;
    }
    	
	
}
