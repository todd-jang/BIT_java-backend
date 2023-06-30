package collection;

public class VectorTest01 {
	Vector<String> v=new Vector<>();
	
	v.addElement("둘리");
	v.addElement("마이콜");
	v.addElement("도너");
	
	//순회
	for (int i=0;i<v.size();i++) {
		String s=v.elementAt(i);
		System.out.println(s);
	}
}
