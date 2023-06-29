package paint;

import chapter04.Point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x,int y, String color) {
		//this.x=x;
		//this.y=y;
		
		//setX(x);
		//setY(y);
		super(x, y);//파라미터 불러와 사용(부모 생성자?)앞에서 코딩
		this.color=color;
	}
	
	public String getColor {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	@Override
	public void show() {
		super.show();
	}
}
