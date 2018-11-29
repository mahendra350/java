class Engine
{
	int EngNum;
	int spokes;
	int power;
	String type;
	float Weight;
	public Engine(int engNum, int spokes, int power, String type, float weight) {
		EngNum = engNum;
		this.spokes = spokes;
		this.power = power;
		this.type = type;
		this.Weight = weight;
	}
	
}
class CarGo
{
	String Brand;
	int wheels;
	int brakes;
	String color;
	int gears;
	Engine eng;
	public CarGo(String Brand, int wheels, int brakes, String color, int gears, Engine eng) {
		this.Brand = Brand;
		this.wheels = wheels;
		this.brakes = brakes;
		this.color = color;
		this.gears = gears;
		this.eng = eng;
	}
	void getData()
	{
		System.out.println("Brand name :"+Brand);
		System.out.println("No of wheels :"+wheels);
		System.out.println("Brakes :"+brakes);
		System.out.println("Gears :"+gears);
		System.out.println("Engine details:"+eng.EngNum+" ,spokes:"+eng.spokes+" ,power:"+eng.power+",type:"+eng.type+",Weight:"+eng.Weight);
		
	}
}

public class PolyMorpCarEngine {

	public static void main(String[] args) {
		Engine obj=new Engine(1289,8,1200,"petrol",4.8f);
		CarGo obj1=new CarGo("SKODA",4,2,"RED",6,obj);
		obj1.getData();
		

	}

}
