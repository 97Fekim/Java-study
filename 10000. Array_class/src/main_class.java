import java.util.*;

public class main_class 
{
	public static void main(String[] args) 
	{
		/* Array ��ü�� �迭 ����־� ���� */
		int[] nIntArray = {1,4,7,2,6,3,5};
		System.out.println("������ : "+ Arrays.toString(nIntArray));
		
		/* ���� */
		Arrays.sort(nIntArray);
		System.out.println("������ : " + Arrays.toString(nIntArray));
		
		/* �˻� */
		System.out.println(Arrays.binarySearch(nIntArray, 13));	// 13�� �����Ƿ�, ���� ����
		System.out.println(Arrays.binarySearch(nIntArray, 5));	// 4�� �ε����� 5�� �ִ�.
		
		/* ġȯ(memset) */
		Arrays.fill(nIntArray, 1,3,12);	// 1~(3-1) �ε����� 12�� �ٲ��	
		System.out.println("ġȯ��� : " + Arrays.toString(nIntArray));		
	}
}
