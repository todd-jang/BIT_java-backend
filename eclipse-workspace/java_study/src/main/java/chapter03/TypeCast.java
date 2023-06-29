package chapter03;

public class Ex03Typecast {

		public static void main(String[] args) {
				int i1 = 10;
				long l1 =1000L;
				
				float f1 = 3.14f;
				double d1 = 3.14;
				
				//explicit 
				int i2 = (int)l1;
				float  f2 = (float)d1;
				
				int i3= (int) f1;
				
				//암시?
				longl2 = i1;
				double d2 = f1;
				double d3= i1;
				
				//데이터 의미가 다르면 캐스팅 안됨
		}		
}
