public class console_out 
{
	public static void main(String[] args) 
	{
		// char>>int console_out
		System.out.printf("%1$d %2$d", (int)'3', (int)'A');
		System.out.println();
		// Variables
		int nVar = 12;
		float fVar = 3.14f;
		System.out.print(nVar);
		System.out.println();
		System.out.print(fVar);
		System.out.println();
		System.out.println("정수 : " + nVar + "\n" + "부동소수 : " + fVar);
	}
}

