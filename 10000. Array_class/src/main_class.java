import java.util.*;

public class main_class 
{
	public static void main(String[] args) 
	{
		/* Array 객체에 배열 집어넣어 생성 */
		int[] nIntArray = {1,4,7,2,6,3,5};
		System.out.println("정렬전 : "+ Arrays.toString(nIntArray));
		
		/* 정렬 */
		Arrays.sort(nIntArray);
		System.out.println("정렬후 : " + Arrays.toString(nIntArray));
		
		/* 검색 */
		System.out.println(Arrays.binarySearch(nIntArray, 13));	// 13이 없으므로, 음수 리턴
		System.out.println(Arrays.binarySearch(nIntArray, 5));	// 4번 인덱스에 5가 있다.
		
		/* 치환(memset) */
		Arrays.fill(nIntArray, 1,3,12);	// 1~(3-1) 인덱스를 12로 바꿔라	
		System.out.println("치환결과 : " + Arrays.toString(nIntArray));		
	}
}
