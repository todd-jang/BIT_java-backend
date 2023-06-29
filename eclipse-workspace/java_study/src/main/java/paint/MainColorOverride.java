package paint;

public class Main {
	
	public static void main(String[] args) {
			paint.point point=new Point();
			point.setX(100));
			point.setY(50);
			drawPoint(point);
			
			point1.show(false);
			
			paint.point point2=new Point(200,150);
			point.setX(100));
			point.setY(50);
			drawPoint(point2);//?
			
			point2.show(false);
//			Point point3 = new ColorPoint();//ColorPoint cp = new ColorPoint(); Point p3=cp;(up 
//			point3.setX(200);		
//			point3.setY(100);
			point3.setColor("red");//((ColorPoint)point3).setColor("red");
			
			drawPoint(point3);
}
	public static void drawPoint(Point point) {
		    point.show(true);//override된 show(true);
	}
//	public static void drawColorPoint(ColorPoint colorpoint) {
//		    colorpoint.show();
//	}
}
