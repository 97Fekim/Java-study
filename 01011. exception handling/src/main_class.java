
public class main_class {

	public static void main(String[] args) {
		int nVar = 0;
		int nResult;
		int nArray[] = {0,1,2,3,4};
		
		/* 0���� ������ ����ó�� */
		/*try
		{
			nResult = 7 / 0;
		} catch(ArithmeticException e) {
			System.out.println("Failed");
		}*/
		
		/* �������� ����ó�� */
		/*try
		{
			for(int i = 0; i < 6; ++i)
				System.out.println(nArray[i]);
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out");
		}*/
		
		/* ���ܰ� ������, ����Ǵ� finally */
		/*try
		{
			nResult = 7 / nVar;
		}catch(ArithmeticException e) {
			System.out.println("Failed");
		}finally {
			System.out.println("Good Bye");
		}*/
		
		/* ���ܰ� ������, ����Ǵ� finally */
		try
		{
			nResult = 7 / 1;
		}catch(ArithmeticException e) {
			System.out.println("Failed");
		}finally {
			System.out.println("Good Bye");
		}
		
	}
}

