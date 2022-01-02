
public class main_class 
{
	public static void main(String[] args) 
	{
		/* String(고정문자열) */
		{
			/* 고정문자열 생성의 두가지 방법 */
			String str1 = new String("Hi there!");
			String str2 = "Hi there!";
		
			System.out.println(str1);
			System.out.println(str2);
		
			/* 문자열 붙이기 (두가지 방법) */
			String str3 = str1 + str2;	// 연산자 이용
			System.out.println(str3);
		
			str3 = str1 + "12345";
			System.out.println(str3);
		
			str3 = str1.concat(str2);	// concat() 이용
			System.out.println(str3);
		
			/* valueOf() 함수 */
			String str4 = String.valueOf(3.14f);
			System.out.println(str4);
		
			char[] strArray = {'a','b','c','d','e'};
			String str5 = String.valueOf(strArray);
			System.out.println("str5 : " + str5);
			System.out.println("str5의 길이 : " + str5.length());
		}
		
		/* StringBuffer(유동문자열) */
		{
			/* StringBuffer에 고정문자열 붙이기 */
			StringBuffer str1 = new StringBuffer("abcdefg");
			String str2 = "hijk";
			str1.append(str2);
			System.out.println(str1 + " 문자열 길이 : " + str1.length());
			
			StringBuffer str3 = new StringBuffer(100);
			str3.append("abcde");
			System.out.println(str3 + ", length : " + str3.length());
			
			/* StringBuffer index 삭제하기 */
			str3.delete(0, str3.length()-2);
			System.out.println(str3 + ", length : " + str3.length());
		}
		
	}
}
