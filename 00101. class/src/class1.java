
public class class1 {
	public static void main(String[] args) {
		Book JavaBook = new Book();		// 객체 생성
		JavaBook.SetTitle("Java programming");	// 멤버변수 초기화
		System.out.println(JavaBook.GetTitle());	// 멤버변수 출력
		
		//System.out.println(JavaBook.GetVar());
		
		/* 함수 오버로딩 출력 예제 */
		/* parameter의 자료형을 다르게하여 함수 오버로딩을 구현한다 */
		OverLoadTest OverLoad = new OverLoadTest();
		System.out.println(OverLoad.Add(1,2));
		System.out.println(OverLoad.Add(1.0f,2.0f));
		System.out.println(OverLoad.Add(1,2,5.0f));
		
	}
	
}

/* class의 기본 형식 */
class Book {
	/* 멤버 변수 */
	String m_strTitle;
	int m_nPage;
	String m_strPublisher;
	int m_nPrice;
	
	/* 접근제어자 데이터형 변수명 */
	public int m_nVar;
	
	/* 접근제어자 리턴형 함수명 */
	private int GetVar()
	{
		return m_nVar;
	}
	
	/* 메소드 형식 */
	void SetTitle(String strTitle)
	{
		m_strTitle = strTitle;
	}
	
	String GetTitle()
	{
		return m_strTitle;
	}
	
	//.
	//. etc
	
	// 객체 생성은 new를 이용한다.
	// new 이용시, 메모리 해체가 필요없다 (garbage collector가 있기 때문에.)
	// 멤버변수와 메소드에 접근하는 방법은 '.' 이다.
}

/* 함수 오버로딩 예제 클래스 */
class OverLoadTest
{
	public int Add(int nVar1, int nVar2)
	{
		return nVar1 + nVar2;
	}

	public float Add(float fVar1, float fVar2)
	{
		return fVar1 + fVar2;
	}
	
	public int Add(int nVar1, int nVar2, float fVar1)
	{
		return nVar1 + nVar2 + (int)fVar1;
	}
}

