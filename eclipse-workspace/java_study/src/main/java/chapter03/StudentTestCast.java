package chapter03;

public class StudentTest {
	
	public static void main(String[] args) {
		Student s=new Student();//부모가 자식보다 먼저 호출됨!
		s.setGrade(1);
		
		//casting~UPcasting(implicit)
		Person p1=s1;
		p1.setName("둘리");
		

        System.out.println( p.getName() );

		Student s2=(Student)p1; //Down Casting
		s2.setMajor("Comp Scie");
	}

}
