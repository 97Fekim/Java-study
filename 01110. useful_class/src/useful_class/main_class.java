package useful_class;

public class main_class {
	
	/* Autoboxing ���� */
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
		
		/* ���� > ���ڿ� (������ ��ü�� �̿�) */
		String str = intVar1.toString();
		System.out.println("first String : " + str);
		
		/* ���ڿ� > ���� (��ü�� �������� �ʾ���) */
		nVar1 = Integer.parseInt("500");
		System.out.println("second int value : " + nVar1);
		
		/* ���� > ���ڿ� (��ü�� �������� ����) */
		str = Integer.toString(nVar1);
		System.out.println("second String : " + str);
		
		/* ���ڿ� > int��ü */
		Integer intVar2 = Integer.valueOf("100");
		System.out.println("int ��ü�� �� : " + intVar2.intValue());
		
	
		Integer IntVar = 12; // = new Integer(12); ,Autoboxing  
		int nVar = 3;
		int nTotal = nVar + IntVar;	// = IntVar.intValue(); ,Autoboxing
		System.out.println("--------Autoboxing-------");
		System.out.println("IntVar : " + IntVar );
		System.out.println("Total = " + nTotal);
		System.out.println("return value : " + Add(IntVar));
		
	}

}
