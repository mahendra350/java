
public class Big {

	public static void main(String[] args) {
		int a[]={45,97,98,99,56};
		int b=a[0];
		for (int i=1;i<a.length;i++)
		{
			if(a[i]>b)
			{
				b=a[i];
			
			}	
			
		}
		System.out.println(b+"is bigger");
		
	}

}
