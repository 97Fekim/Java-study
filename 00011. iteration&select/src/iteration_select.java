
public class iteration_select 
{
	public static void main(String[] args) 
	{
		// for문
		for(int i = 0; i < 3; i++)
		{
			System.out.println("java programming");
		}
		System.out.println();
		
		// while문
		int i = 0;
		while(i < 3)
		{
			System.out.println("Java programming");
			i++;
		}
		System.out.println();
		
		// do-while문
		do
		{
			System.out.println("Java programming");	
		}while(false);
		System.out.println();
		
		// if-else 문은 생략하겠습니다.
		// c와 문법이 이하동문이기 때문입니다.
		
		// continue
		for(int j = 0; j < 5; j++)
		{
			if(j == 3)
				continue;
			System.out.println(j);
		}
		System.out.println();
		
		// label-break문
		int k = 0;
		OUT : while(true)
		{
			while(true)
			{
				k++;
				if(k == 3)
				{
					System.out.println("Java programming");
					break OUT;
				}
				else
				{
					System.out.println("good bye!");
				}
				
			}
			
		}
		
	}
}
