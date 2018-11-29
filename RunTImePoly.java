class Bank
{
	void getData()
	{
		System.out.println("rate of interest depends upon bank");
	}
}
class Icici extends Bank
{
	void getData()
	{
		System.out.println("ICICI BANK rate of interest is 18% ");
	}
}
class Sbi extends Bank
{
	void getData()
	{
		System.out.println("SBI BANK rate of interest is 8% ");
	}
}
class AndhraBank extends Bank
{
	void getData()
	{
		System.out.println("ANDHRA BANK rate of interest is 10% ");
	}
}
class CitiBank extends Bank
{
	void getData()
	{
		System.out.println("Citi Bank rate of interest is 14%");
	}
}
public class RunTImePoly {

	public static void main(String[] args) {
		Bank obj=new Icici();
		obj.getData();
		Bank obj1=new Sbi();
		obj1.getData();
		Bank obj2=new AndhraBank();
		obj2.getData();
		Bank obj3=new CitiBank();
		obj3.getData();	
	}

}
