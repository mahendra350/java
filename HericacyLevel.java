class Car1
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
class Ford1 extends Car1
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
class Honda extends Car1
{
	String color="Red";
	int Ac=1;
	int AirBags=0;
	String AutoGear="no";
	void getHonda()
	{
		System.out.println("color is :"+color);
		System.out.println("Ac :"+Ac);
		System.out.println("AirBags :"+AirBags);
		System.out.println("AutoGear :"+AutoGear);
	}
}
class Skoda extends Car1
{
	String color="White";
	int Ac=1;
	int AirBags=4;
	String AutoGear="yes";
	void getSkoda()
	{
		System.out.println("color is :"+color);
		System.out.println("Ac :"+Ac);
		System.out.println("AirBags :"+AirBags);
		System.out.println("AutoGear :"+AutoGear);
	}
}

public class HericacyLevel {

	public static void main(String[] args) {
		Skoda obj=new Skoda();
		System.out.println("================");
		System.out.println("Car properties");
		System.out.println("================");
		obj.getCar();
		System.out.println("================");
		System.out.println("Ford properties");
		System.out.println("================");
		Ford1 obj1=new Ford1();
		obj1.getCar();
		obj1.getFord();
		System.out.println("================");
		System.out.println("Honda properties");
		System.out.println("================");
		Honda obj2=new Honda();
		obj2.getCar();
		obj2.getHonda();

		System.out.println("================");
		System.out.println("Skoda properties");
		System.out.println("================");
		obj.getCar();
		obj.getSkoda();
		
	}

}
