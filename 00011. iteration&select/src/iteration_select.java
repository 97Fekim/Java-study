
public class iteration_select 
{
	public static void main(String[] args) 
	{
		// for��
		for(int i = 0; i < 3; i++)
		{
			System.out.println("java programming");
		}
		System.out.println();
		
		// while��
		int i = 0;
		while(i < 3)
		{
			System.out.println("Java programming");
			i++;
		}
		System.out.println();
		
		// do-while��
		do
		{
			System.out.println("Java programming");	
		}while(false);
		System.out.println();
		
		// if-else ���� �����ϰڽ��ϴ�.
		// c�� ������ ���ϵ����̱� �����Դϴ�.
		
		// continue
		for(int j = 0; j < 5; j++)
		{
			if(j == 3)
				continue;
			System.out.println(j);
		}
		System.out.println();
		
		// label-break��
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
