
public class inheritance1 
{
	public static void main(String[] args) 
	{
		/* �̰� �ȴ� */
		B exam = new B();		
		exam.PrintC();
		
		/* overriding ���� */
		overriding_exam2 exam2 = new overriding_exam2();
		System.out.println(exam2.Set(11));
		
		/* cast operator ���� */
		cast_operator3 exam5 = new cast_operator3();
		cast_operator2 exam4 = new cast_operator3();
		
		cast_operator1 exam3 = (cast_operator1)exam4;
		exam3.Print1();
		exam4.Print1();
		
		/* ��� Ŭ������ �������̵��ÿ�, ������ Ŭ������ �Լ��� ȣ��ȴ�. */
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

