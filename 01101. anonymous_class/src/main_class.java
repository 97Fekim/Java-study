
public class main_class {

	public static void main(String[] args) {

		InterfaceClass Test1 = new InterfaceClass();
		Test1.Print();
		
		ClassA Test2 = new ClassA();
		Test2.Print();
		
		/* 익명클래스 선언 , Print()함수를 재정의함 */
		InterfaceClass Test3 = new InterfaceClass()
				{
					public void Print()
					{
						System.out.println("Anonymous!");
					}
				};
		Test3.Print();
		
		ClassA Test4 = new ClassA()
				{
					public void Print()
					{
						System.out.println("Hi Anonymous!");
					}
				};
		Test4.Print();
				
		ClassB Test5 = new ClassB();
		Test5.SetClass(new ClassA());
		
		Test5.SetClass(new ClassA()
		{
			public void Print()
			{
				System.out.println("Set Anonymous!");
			}
		});
		
		
	}

}

interface Testable
{
	public void Print();
}

class InterfaceClass implements Testable
{
	public void Print()
	{
		System.out.println("Hi!");
	}
}

class ClassA
{
	public void Print()
	{
		System.out.println("Good!");
	}
}

class ClassB
{
	void SetClass(ClassA ObjectA)
	{
		ObjectA.Print();
	}
}

