
public class main_class {

	public static void main(String[] args) {
		
		ab_exam2 exam2 = new ab_exam2();
		exam2.Print();
		exam2.Print1();
		
		/* exam2 ��ü�� exam1 ��ü�� �� ��ȯ */
		ab_exam1 exam1 = new ab_exam2();
		exam1.Print();
		exam1.Print1();		
		 
	}

}

/* �߻� Ŭ���� */
abstract class ab_exam1
{
	public int m_nVar = 7;
	public void Print()
	{
		System.out.println("abstract class");
	}
	abstract void Print1();	// ���� Ŭ�������� ���� ������ �޼ҵ�
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
