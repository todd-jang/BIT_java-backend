package chapter03;

public class Goods {
	private String name;   
	private int price;  
	private int countStock;
	private int countSold;
	
	public static int countOfGoods =0;
	
	public Goods() {
		countOfGoods=countOfGoods +1;	
	}//생성자이다
	public Goods(String name, int price, int countStock, int countSold) {
		this();
		
		this.name=name;
		this.price=price;
		this.countStock=countStock;
		this.countSold=countSold;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
