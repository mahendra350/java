class SquRec
{	
	int x,y;
	void area(int x)
	{
		int s=x*x;
		System.out.println("Area of square: "+s);
	}
	void area(int x,int y)
	{
		int z=x*y;
		System.out.println("Area of rectangle :"+z);
	}
}
public class AreaSquareOverLoading {

	public static void main(String[] args) {
		SquRec obj=new SquRec();
		obj.area(5);
		obj.area(10,20);
	}

}
