
public class main_class {

	public static void main(String[] args) {
		
		// ����1
		OutClass OutTest1 = new OutClass();
		OutTest1.Inner.Print();
		
		// ����2
		OutClass1 OutTest2 = new OutClass1();
		OutClass1.InnerClass1 InnerTest1 = OutTest2.new InnerClass1();
		InnerTest1.Print();
		
		// ����3
		OutClass2.InnerClass.Print(); // ��ü�� �������� �ʰ� ȣ�� �����ϴ�.
	}

}

// �ܺ�Ŭ�������� new�� ���� ����Ŭ������ �����ϰ� �޼ҵ带 ȣ���ϴ� ��
class OutClass
{
	int nVar1 = 3;
	
	class InnerClass
	{
		void Print() 
		{
			// ����Ŭ�������� �ܺ�Ŭ������ ������ ȣ���ؼ� ���
			System.out.println("Out class : " + nVar1);
		}
	}
	InnerClass Inner = new InnerClass();
}

// �ܺο��� ����Ŭ������ �����Ͽ� ȣ���ϴ� �� >> �幰�� ���
class OutClass1
{
	int nVar1 = 3;

	class InnerClass1
	{
		void Print()
		{
			System.out.println("Out class1 : " + nVar1);
		}
	}
}

// ���� ����Ŭ����
class OutClass2
{
	static int nVar2 = 7;
	static class InnerClass
	{
		static void Print()
		{
			System.out.println("static inner class : " + nVar2);
		}
	}
}
