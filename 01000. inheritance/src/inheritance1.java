public class inheritance1 {
	public static void main(String[] args) {
		
		/* �̰� �ȴ� */
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
	}	// private �Ӽ��� PrintA �Լ���, A Ŭ���������� ��� ����.
}

class B extends A {

	/* ���� Ŭ�������� private���� ������ ����,�Լ��� ���� >> Error */
	void PrintC() {
		
		//PrintA();	// �̰� �ȵȴ�.!
		PrintB();
		//System.out.println(m_nVar1);
	}
}