import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class main_class {

	public static void main(String[] args) {
		
		/* �Ϲ����� ���� ��� */
		Vector MyVector = new Vector();
		MyVector.addElement(new Integer(3));
		MyVector.addElement(new Float(3.14f));
		MyVector.addElement("java");
		MyVector.addElement("Hi!");
		System.out.println(MyVector);
		
		for(int i = 0; i < 4; ++i)
			System.out.println(MyVector.elementAt(i));
		
		int nVar = (int)MyVector.firstElement();
		System.out.println("first element : " + nVar);
		System.out.println("����� ��ü ���� : " + MyVector.size());
		
		/* generics ����� ���� ��� */
		Vector<String> strVector = new Vector();
		strVector.add("You ");
		strVector.add("are ");
		strVector.add("so ");
		strVector.add("cool!");
		System.out.println(strVector);
		
		String str2 = strVector.get(2);
		System.out.println(str2);
		
		int nIndex = strVector.indexOf("cool!");
		System.out.println(nIndex);
		
		/* ArrayList ���� */
		ArrayList List1 = new ArrayList();
		List1.add(7);
		List1.add(3);
		List1.add(1);
		List1.add(5);
		List1.add(4);
		
		System.out.println("���� : " + List1.size());
		System.out.println("����Ʈ : " + List1);
		Collections.sort(List1);
		System.out.println("���ĵ� ����Ʈ : " + List1);
		
		List1.set(4, 1000);
		System.out.println("�ٲ� ����Ʈ : " + List1);
		
		int nVar1 = (int)List1.get(2);
		System.out.println(nVar);
		
		List1.clear();
		System.out.println("���� : " + List1.size());
		
	}

}
