
public class Myclass {

	public static void main(String[] args) {

		/* 생성자 예제 출력 */
		constructor_example2 exam = new constructor_example2();
		System.out.println("Test1 m_nVar : " + exam.m_nVar);
		
		/* static 예제 출력 */
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
		// 어떤 객체에서 static 변수를 바꾸든, 값은 일정하다.
		
	}

}

/* 생성자 기본 예제 */
class constructor_example
{
	public constructor_example()
	{
		
	}
	
	/* 매개변수와 함께 호출되는 생성자 */
	public constructor_example(int nVar1, int nVar2)
	{
		
	}
	
}

/* 생성자 호출 예제 */
class constructor_example2
{
	public int m_nVar;
	public float m_fVar = 3.14f;
	
	public constructor_example2()
	{
		this(6);	// this()는 생성자에서 또다른 생성자를 호출한다.
		m_nVar = 12;
		// this(7); // 첫줄에서만 호출해야하므로, 이 경우 contradiction.
	}
	
	/* 매개변수와 함께 호출되는 생성자 */
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