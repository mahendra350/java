import java.util.Scanner;
import java.io.IOException;
class Address
{
	int house;
	String street;
	String city;
	public Address(int house, String street, String city) {
		this.house = house;
		this.street = street;
		this.city = city;
	}
}
class Student 
{
	int regno;
	String name;
	Address ad;
	public Student(int regno, String name, Address ad) {
		this.regno = regno;
		this.name = name;
		this.ad=ad;
	}
}
public class StudentInput {

	public static void main(String[] args) {
		
		System.out.println("enter the number of students :");
		Scanner sc=new Scanner(System.in);
		int stu=sc.nextInt();
		//array for number of students
		Student[] st=new Student[stu];
		for(int i=0;i<stu;i++)
		{
			System.out.println("enter the regno: ");
			int regno=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the name :");
			String name=sc.nextLine();
			
			System.out.println("enter the door number");
			int house=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the street name :");
			String street=sc.nextLine();
			
			System.out.println("enter the city :");
			String city=sc.nextLine();
			
			Address adr=new Address(house,street,city);
			Student stud=new Student(regno,name,adr);
			st[i]=stud;
		}
			sc.close();
			//to print number of students
			for(int j=0;j<stu;j++)
				
			{
				
				System.out.println(st[j].regno+"   "+st[j].name+"    "+st[j].ad.house+"   "+st[j].ad.street+"    "+st[j].ad.city);
			}
			
	
		
		
	}
}
