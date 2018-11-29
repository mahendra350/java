class D
{
	D(String name)
	{
		System.out.println("name of the string :"+name);
	}
}
class E extends D
{
	E(String name)
	{
		super(name);
		System.out.println("nothing");
	}
}
class F extends E
{
	F(int y,String name)
	{
		super(name);
		System.out.println("integer y value is :"+y);
	}
}
class G extends E
{
	G(double d,String name)
	{
		super(name);
		System.out.println("double value d is :"+d);
	}
}
public class MultiLvHiracInher {

	public static void main(String[] args) {
		G obj=new G(23.14,"hello");
		F obj1=new F(34,"world");
		
	}

}
