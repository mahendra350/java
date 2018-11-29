class Laptop
{
	int display=1;
	int keyboard=1;
	int trackpad=1;
	void getLaptop()
	{
		System.out.println("no of display's :"+display);
		System.out.println("no of keyboard :"+keyboard);
		System.out.println("no of trackpad :"+trackpad);
	}
}
class BusinessLaptop extends Laptop
{
	String Os="windows professional";
	int Cam=1;
	int Speaker=2;
	void getBusinessLaptop()
	{
		
			System.out.println("type of OS :"+Os);
			System.out.println("no of camera's :"+Cam);
			System.out.println("no of Speaker :"+Speaker);
		
	}
}
class GamingLaptop extends BusinessLaptop
{
	int ram=8;
	int graphic=1;
	int fans=2;
	void getGamingLaptop()
	{
		
			System.out.println("size of ram :"+ram);
			System.out.println("no of graphic cards :"+graphic);
			System.out.println("no of fans :"+fans);
		
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		System.out.println("=================");
		System.out.println("Laptop properties");
		System.out.println("=================");
		Laptop obj=new Laptop();
		obj.getLaptop();
		System.out.println("=================");
		System.out.println("BusinessLaptop properties");
		System.out.println("=================");
		BusinessLaptop obj1=new BusinessLaptop();
		obj1.getLaptop();
		obj1.getBusinessLaptop();
		System.out.println("=================");
		System.out.println("GamingLaptop properties");
		System.out.println("=================");
		GamingLaptop obj3=new GamingLaptop();
		obj3.getLaptop();
		obj3.getBusinessLaptop();
		obj3.getGamingLaptop();
		

	}
}

