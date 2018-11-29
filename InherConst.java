

class Apple
{
	Apple(int x)
	{
		System.out.println("integer variable in x is :"+x);
	}
}
class Banana extends Apple
{
	Banana(char ch,double d,int x)
	{
		super(x);
		System.out.println("character ch variable is :"+ch);
		System.out.println("double d value is :"+d);
	}
}

public class InherConst {

	public static void main(String[] args) 
	{

		Banana obj=new Banana('m',29.78,12);

	}

}
