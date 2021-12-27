package useful_class;

public class main_class {
	
	/* Autoboxing 예제 */
	public static int Add(Integer IntVar)
	{
		int nVar = 10;
		IntVar = IntVar + nVar;
		
		return IntVar;
	}
	
	public static void main(String[] args) {
		Integer intVar1 = new Integer(50);
		int nVar1 = intVar1.intValue();
		System.out.println("first int value : " + nVar1);
		
		/* 정수 > 문자열 (생성된 객체를 이용) */
		String str = intVar1.toString();
		System.out.println("first String : " + str);
		
		/* 문자열 > 정수 (객체를 생성하지 않았음) */
		nVar1 = Integer.parseInt("500");
		System.out.println("second int value : " + nVar1);
		
		/* 정수 > 문자열 (객체를 생성하지 않음) */
		str = Integer.toString(nVar1);
		System.out.println("second String : " + str);
		
		/* 문자열 > int객체 */
		Integer intVar2 = Integer.valueOf("100");
		System.out.println("int 객체의 값 : " + intVar2.intValue());
		
	
		Integer IntVar = 12; // = new Integer(12); ,Autoboxing  
		int nVar = 3;
		int nTotal = nVar + IntVar;	// = IntVar.intValue(); ,Autoboxing
		System.out.println("--------Autoboxing-------");
		System.out.println("IntVar : " + IntVar );
		System.out.println("Total = " + nTotal);
		System.out.println("return value : " + Add(IntVar));
		
	}

}
