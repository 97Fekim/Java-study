
public class inheritance1 
{
	public static void main(String[] args) 
	{
		/* 이건 된다 */
		B exam = new B();		
		exam.PrintC();
		
		/* overriding 예제 */
		overriding_exam2 exam2 = new overriding_exam2();
		System.out.println(exam2.Set(11));
		
		/* cast operator 예제 */
		cast_operator3 exam5 = new cast_operator3();
		cast_operator2 exam4 = new cast_operator3();
		
		cast_operator1 exam3 = (cast_operator1)exam4;
		exam3.Print1();
		exam4.Print1();
		
		/* 상속 클래스간 오버라이딩시에, 최하위 클래스의 함수가 호출된다. */
		cast_operator3 exam6 = new cast_operator3();
		exam6.Print();
	}
}

class A {
	private int m_nVar1 = 11;
	
	private void PrintA() {
		System.out.println("A Class " + m_nVar1);
	}
	
	public void PrintB() {
		PrintA();
	}	// private 속성인 PrintA 함수는, A 클래스에서만 사용 가능.
}

class B extends A {

	/* 상위 클래스에서 private으로 지정된 변수,함수에 접근 >> Error */
	void PrintC() {
		
		//PrintA();	// 이건 안된다.!
		PrintB();
		//System.out.println(m_nVar1);
	}
}

