
public class main_class 
{
	public static void main(String[] args) 
	{
		/* String(�������ڿ�) */
		{
			/* �������ڿ� ������ �ΰ��� ��� */
			String str1 = new String("Hi there!");
			String str2 = "Hi there!";
		
			System.out.println(str1);
			System.out.println(str2);
		
			/* ���ڿ� ���̱� (�ΰ��� ���) */
			String str3 = str1 + str2;	// ������ �̿�
			System.out.println(str3);
		
			str3 = str1 + "12345";
			System.out.println(str3);
		
			str3 = str1.concat(str2);	// concat() �̿�
			System.out.println(str3);
		
			/* valueOf() �Լ� */
			String str4 = String.valueOf(3.14f);
			System.out.println(str4);
		
			char[] strArray = {'a','b','c','d','e'};
			String str5 = String.valueOf(strArray);
			System.out.println("str5 : " + str5);
			System.out.println("str5�� ���� : " + str5.length());
		}
		
		/* StringBuffer(�������ڿ�) */
		{
			/* StringBuffer�� �������ڿ� ���̱� */
			StringBuffer str1 = new StringBuffer("abcdefg");
			String str2 = "hijk";
			str1.append(str2);
			System.out.println(str1 + " ���ڿ� ���� : " + str1.length());
			
			StringBuffer str3 = new StringBuffer(100);
			str3.append("abcde");
			System.out.println(str3 + ", length : " + str3.length());
			
			/* StringBuffer index �����ϱ� */
			str3.delete(0, str3.length()-2);
			System.out.println(str3 + ", length : " + str3.length());
		}
		
	}
}
