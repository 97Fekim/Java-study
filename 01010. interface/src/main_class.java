
public class main_class {

	public static void main(String[] args) {

		/* ��� ���� */
		//InterfaceAable exam = new InterfaceAable();
		//exam.Print();
		
		/* ���߻�� ���� */
		class_ab exam = new class_ab();
		exam.Print_a();
		exam.Print_b();
		exam.Print_ab();

	}

}

interface interface1
{
	public static final int m_nVal1 = 10;
	/* abstract method�� ������Ÿ�Ը� ���ǰ����ϴ�. */
	public abstract int m_nFunc1(int nVal); 
}

// ��� ����ȭ

interface interface2
{
	// public static final�� ����
	int m_nVal2 = 10;
	// public abstract�� ����
	int m_Func2(int nVal);
}

/* �������̽� ��� */
interface InterfaceA
{
	int m_nVar = 7;
	void Print(); 	// �߻�޼ҵ�(�����ΰ� ����)
}

class InterfaceAable implements InterfaceA
{
	public void Print()
	{
		System.out.println(m_nVar);
	}
}

/* �������̽� ���� ��� */
interface Interface_a
{
	int m_nVar1 = 10;
	void Print_a();
}

interface Interface_b
{
	int m_nVar2 = 15;
	void Print_b();
}

interface Interface_ab extends Interface_a,Interface_b
{
	void Print_ab();
}

class class_ab implements Interface_ab
{
	public void Print_a()
	{
		System.out.println("a = " + m_nVar1 + '\n');
	}
	public void Print_b()
	{
		System.out.println("b = " + m_nVar2 + '\n');
	}
	public void Print_ab()
	{
		System.out.println("a + b = " + (m_nVar1 + m_nVar2));
	}
}


