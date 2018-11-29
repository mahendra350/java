class Car
{
	int wheels=4;
	int breaks=2;
	int seats=4;
	int clutes=2;
	int tank=1;
	void getCar()
	{
		System.out.println("no of wheels :"+wheels);
		System.out.println("no of breaks :"+breaks);
		System.out.println("no of seats :"+seats);
		System.out.println("no of clutes :"+clutes);
		System.out.println("no of tanks :"+tank);
	}
}
class Ford extends Car
    {
		String color="blue";
		int Ac=1;
		int AirBags=2;
		void getFord()
		{
			System.out.println("color is :"+color);
			System.out.println("Ac :"+Ac);
			System.out.println("AirBags :"+AirBags);
		}
	}
public class TestCarInher {

	public static void main(String[] args) {
		System.out.println("==============");
		System.out.println("car properties");
		System.out.println("==============");
		Car obj=new Car();
		obj.getCar();
		System.out.println("==============");
		System.out.println("ford properties");
		System.out.println("==============");
		Ford obj1=new Ford();
		obj1.getCar();
		obj1.getFord();
		
	}

}
