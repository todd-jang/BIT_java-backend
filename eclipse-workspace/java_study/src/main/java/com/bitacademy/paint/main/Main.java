package com.bitacademy.paint.main;

import com.bitacademy.paint.i.Drawable;
import com.bitacademy.paint.point.Point;

import paint.Shape;

public class Main {
	
	public static void main(String[] args) {
			paint.point point=new Point();
			point.setX(100));
			point.setY(50);
			//drawPoint(point);
			draw(point1);
			point1.show(false);
			
			paint.point point2=new Point(200,150);
			point2.setX(100));
			point2.setY(50);
			//drawPoint(point2);
			draw(point2);
			point2.show(false);
			
			
			Rectangle rectangle =new Rectagle();
//			drawRectangle.draw(rectangle);
			draw(rectangle);
			
			Tria tria=new Tria();
//			drawTria.draw(Tria);
			draw(tria);
			
			Circle circle=new Circle();
			draw(circle);
			
			GraphicText gt= new GraphictText("Hello World");
			draw(gt);
			
			//instanceof 테스트
			System.out.println(circle instanceof Circle);
			System.out.println(circle instanceof Shape);
			System.out.println(circle instanceof Object);
			System.out.println(circle instanceof Drawable);
			
			//오류 class는 hierachy상위와 하위와 instanceof할 수 없다
			//System.out.println(circle instance of Rectangle);
			
			//그러나 interface는 가능하다
			System.out.println(circle instanceof Drawable);
			System.out.println(circle instanceof Runnable);
	}
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	public static void drawShape(Shape shape) {
		shape.show();
	}
    public static void drawPoint(Point point) {
    	point.show();
//	}
//	public static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw();
}
