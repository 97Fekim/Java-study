
public class class1 {
	public static void main(String[] args) {
		Book JavaBook = new Book();		// ��ü ����
		JavaBook.SetTitle("Java programming");	// ������� �ʱ�ȭ
		System.out.println(JavaBook.GetTitle());	// ������� ���
		
		//System.out.println(JavaBook.GetVar());
		
		/* �Լ� �����ε� ��� ���� */
		/* parameter�� �ڷ����� �ٸ����Ͽ� �Լ� �����ε��� �����Ѵ� */
		OverLoadTest OverLoad = new OverLoadTest();
		System.out.println(OverLoad.Add(1,2));
		System.out.println(OverLoad.Add(1.0f,2.0f));
		System.out.println(OverLoad.Add(1,2,5.0f));
		
	}
	
}

/* class�� �⺻ ���� */
class Book {
	/* ��� ���� */
	String m_strTitle;
	int m_nPage;
	String m_strPublisher;
	int m_nPrice;
	
	/* ���������� �������� ������ */
	public int m_nVar;
	
	/* ���������� ������ �Լ��� */
	private int GetVar()
	{
		return m_nVar;
	}
	
	/* �޼ҵ� ���� */
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
	
	// ��ü ������ new�� �̿��Ѵ�.
	// new �̿��, �޸� ��ü�� �ʿ���� (garbage collector�� �ֱ� ������.)
	// ��������� �޼ҵ忡 �����ϴ� ����� '.' �̴�.
}

/* �Լ� �����ε� ���� Ŭ���� */
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

