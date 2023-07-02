package com.bitacademy.paint.shape;

import com.bitacademy.paint.point.Point;

public class Tria extends Shape {

	private int x1, y1;
	private int x2, y2;
	private int x3, y3;
	
	
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}
		System.out.println()
	public static void main(String[] args) {
		paint.point point=new Point();
		point.setX(100));
		point.setY(50);
		drawPoint(point);
		
		paint.point point2=new Point(200,150);
		point.setX(100));
		point.setY(50);
		drawPoint(point2);//?
		
		
		Rectangle rectangle =new Rectagle();
		drawRectangle.draw(rectangle);	

		Tria tria =new Tria();
		drawTria.draw(trai);	
	
	public static void drawPoint(Point point) {
		point.show();
	}
	public static void drawRectangle(Rectangle rectangle) {
		rectangle.draw();
	}	
	public static void drawTria(Tria tria) {;
		tria.draw();
	}	
}
