class CompareS
{
	String s="when there is well there is a way";
	String ar[]=s.split(" ");
	void getData()
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i].equals("there"))
			{
				count++;
			}
		
		}
		System.out.println("count of THERE in given string is :"+count);
		
	}
	
}
public class CompareString {

	public static void main(String[] args) {
		CompareS obj=new CompareS();
		obj.getData();

	}

}
