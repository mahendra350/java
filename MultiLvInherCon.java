class A
{
	A(char a)
	{
		System.out.println("char a variable is :"+a);
	}
}
class B	extends A
{
	B(String st,char a)
	{
		super(a);
		System.out.println("string variables is "+st);
	}
}
class C extends B
{
	C(int x,String st,char a)
	{
		super(st,a);
		System.out.println("integer variable is :"+x);
	}
}
public class MultiLvInherCon {

	public static void main(String[] args) {
		C obj=new C(10,"hello world",'h');

	}

}
