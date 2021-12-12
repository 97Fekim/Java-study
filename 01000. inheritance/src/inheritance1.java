public class inheritance1 {
	public static void main(String[] args) {
		
		/* 이건 된다 */
		B exam = new B();		
		exam.PrintC();
		
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