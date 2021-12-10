
public class Myclass {

	public static void main(String[] args) {

		/* ������ ���� ��� */
		constructor_example2 exam = new constructor_example2();
		System.out.println("Test1 m_nVar : " + exam.m_nVar);
		
		/* static ���� ��� */
		static_example exam1 = new static_example();
		static_example exam2 = new static_example();
		static_example exam3 = new static_example();
		exam1.SetVar(8);
		System.out.println(exam1.GetVar());
		System.out.println(exam2.GetVar());
		System.out.println(exam3.GetVar());
		exam2.SetVar(10);
		System.out.println(exam1.GetVar());
		System.out.println(exam2.GetVar());
		System.out.println(exam3.GetVar());
		// � ��ü���� static ������ �ٲٵ�, ���� �����ϴ�.
		
	}

}

/* ������ �⺻ ���� */
class constructor_example
{
	public constructor_example()
	{
		
	}
	
	/* �Ű������� �Բ� ȣ��Ǵ� ������ */
	public constructor_example(int nVar1, int nVar2)
	{
		
	}
	
}

/* ������ ȣ�� ���� */
class constructor_example2
{
	public int m_nVar;
	public float m_fVar = 3.14f;
	
	public constructor_example2()
	{
		this(6);	// this()�� �����ڿ��� �Ǵٸ� �����ڸ� ȣ���Ѵ�.
		m_nVar = 12;
		// this(7); // ù�ٿ����� ȣ���ؾ��ϹǷ�, �� ��� contradiction.
	}
	
	/* �Ű������� �Բ� ȣ��Ǵ� ������ */
	public constructor_example2(int nVar)
	{
		m_nVar = nVar;
	}	
}

class static_example
{
	public static int m_nVar = 10;

	int GetVar()
	{
		return m_nVar;
	}
	
	void SetVar(int nVar)
	{
		m_nVar = nVar;
	}
}