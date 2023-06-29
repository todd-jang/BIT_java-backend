package chapter03;

import mypackage.Goods2;

public class DiscountGoods2 extends Goods{
	private float discountRate =0.3f;
	
	public int getDiscountPrice (){
		return (int) (price*discountRate);
	}
	{
}

}
