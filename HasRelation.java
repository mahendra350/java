class TempAddress
{
	int doorno;
	String Street;
	String area;
	int pincode;
	public TempAddress(int doorno, String street, String area, int pincode) {
		this.doorno = doorno;
		this.Street = street;
		this.area = area;
		this.pincode = pincode;
	}
}
class PerAddress
{
	int doorno;
	String Street;
	String area;
	int pincode;
	public PerAddress(int doorno, String street, String area, int pincode) {
		this.doorno = doorno;
		this.Street = street;
		this.area = area;
		this.pincode = pincode;
	}
	
	
}
class Empolyee
{
	int empid;
	String name;
	int salary;
	TempAddress adr;
	PerAddress adr1;
	public Empolyee(int empid, String name, int salary, TempAddress adr, PerAddress adr1) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.adr = adr;
		this.adr1 = adr1;
	}
	void getData()
		{
			System.out.println("EMPOLYEE ID IS :"+empid);
			System.out.println("EMPOLYEE NAME IS :"+name);
			System.out.println("EMPOLYEE Salary :"+salary);
			System.out.println("TEMPERARY ADDRESS :"+adr.doorno+" ,"+adr.Street+" ,"+adr.area+" ,"+adr.pincode);
			System.out.println("PERMANENT ADDRESS :"+adr1.doorno+" ,"+adr1.Street+" ,"+adr1.area+" ,"+adr1.pincode);
		}
	
	
}
public class HasRelation {

	public static void main(String[] args) {
		TempAddress obj=new TempAddress(14,"madhapur","hyderabad",500018);
		PerAddress obj1=new PerAddress(89,"kukatpally","hyderabad",500081);
		Empolyee obj2=new Empolyee(121,"mahendra",56000,obj,obj1);
		obj2.getData();
	}

}