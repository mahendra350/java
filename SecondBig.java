
public class SecondBig {

	public static void main(String[] args) {
		int a[]={12,54,78,24,65,106};
		int b=a[0];
		int c=0;
		int k=0;
		for(int i=1;i<a.length;i++)
		{	
		if(b<a[i])
			{
				b=a[i];
				k=i;//for finding index
			}
		}
		System.out.println(b+" first bigger value ");
		

		for(int i=0;i<a.length;i++)//for finding 2nd 
		{	
		if(i!=k)
			{
				if(c<a[i])
				{
					c=a[i];	
				}
			}
		}
		System.out.println(c+" second bigger value ");
		
	}

}
