
public class main_class {

	public static void main(String[] args) {

		/* 상속 예제 */
		//InterfaceAable exam = new InterfaceAable();
		//exam.Print();
		
		/* 다중상속 예제 */
		class_ab exam = new class_ab();
		exam.Print_a();
		exam.Print_b();
		exam.Print_ab();

	}

}

interface interface1
{
	public static final int m_nVal1 = 10;
	/* abstract method는 프로토타입만 정의가능하다. */
	public abstract int m_nFunc1(int nVal); 
}

// ↓↓ 간소화

interface interface2
{
	// public static final이 생략
	int m_nVal2 = 10;
	// public abstract가 생략
	int m_Func2(int nVal);
}

/* 인터페이스 상속 */
interface InterfaceA
{
	int m_nVar = 7;
	void Print(); 	// 추상메소드(구현부가 없음)
}

class InterfaceAable implements InterfaceA
{
	public void Print()
	{
		System.out.println(m_nVar);
	}
}

/* 인터페이스 다중 상속 */
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


