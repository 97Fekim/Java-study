
public class main_class {

	public static void main(String[] args) {
		
		// 예제1
		OutClass OutTest1 = new OutClass();
		OutTest1.Inner.Print();
		
		// 예제2
		OutClass1 OutTest2 = new OutClass1();
		OutClass1.InnerClass1 InnerTest1 = OutTest2.new InnerClass1();
		InnerTest1.Print();
		
		// 예제3
		OutClass2.InnerClass.Print(); // 객체를 생성하지 않고 호출 가능하다.
	}

}

// 외부클래스에서 new를 통해 내부클래스를 생성하고 메소드를 호출하는 예
class OutClass
{
	int nVar1 = 3;
	
	class InnerClass
	{
		void Print() 
		{
			// 내부클래스에서 외부클래스의 변수를 호출해서 사용
			System.out.println("Out class : " + nVar1);
		}
	}
	InnerClass Inner = new InnerClass();
}

// 외부에서 내부클래스를 생성하여 호출하는 예 >> 드물게 사용
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

// 정적 내부클래스
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
