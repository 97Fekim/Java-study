
public class overriding_exam {
	protected int m_nVar;
	public int Set(int nVar)
	{
		m_nVar = nVar;
		return m_nVar;
	}
}

class overriding_exam2 extends overriding_exam {
	
	public int Set(int nVar)
	{
		m_nVar = nVar + 1;
		return m_nVar;
	}
	
}