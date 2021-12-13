
public class cast_operator {

}

class cast_operator1
{
	public void Print1()
	{
		System.out.println("class 1");
	}
	
	/* 오버라이딩 함수 */ 
	public void Print()
	{
		System.out.println("class 1");
	}
	
}

class cast_operator2 extends cast_operator1
{
	public void Print2()
	{
		System.out.println("class 2");
	}
	
	/* 오버라이딩 함수 */ 
	public void Print()
	{
		System.out.println("class 2");
	}
}

class cast_operator3 extends cast_operator2
{
	public void Print3()
	{
		System.out.println("class 3");
	}
	
	/* 오버라이딩 함수 */ 
	public void Print()
	{
		System.out.println("class 3");
	}
}

