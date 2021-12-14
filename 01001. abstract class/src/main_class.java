
public class main_class {

	public static void main(String[] args) {
		
		ab_exam2 exam2 = new ab_exam2();
		exam2.Print();
		exam2.Print1();
		
		/* exam2 객체를 exam1 객체로 형 변환 */
		ab_exam1 exam1 = new ab_exam2();
		exam1.Print();
		exam1.Print1();		
		 
	}

}

/* 추상 클래스 */
abstract class ab_exam1
{
	public int m_nVar = 7;
	public void Print()
	{
		System.out.println("abstract class");
	}
	abstract void Print1();	// 하위 클래스에서 구현 예정인 메소드
}

class ab_exam2 extends ab_exam1
{
	void Print1()
	{
		System.out.println("ab_exam2");
	}
}

class ab_exam3 extends ab_exam1
{
	void Print1()
	{
		System.out.println("ab_exam3");
	}
}
