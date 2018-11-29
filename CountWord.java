class word
{
	String s="Java is a object oriented programming language developed by James Gosling";
	String s1[]=s.split(" ");
	String s2[]=s.split("");
	int a=0;
	int b=0;
	void getData()
	{
		for(int i=0;i<s1.length;i++)
		{
			a++;
		}
		for(int i=0;i<s2.length;i++)
		{
			b++;
		}
		System.out.println("words are "+a);
		System.out.println("letters are "+b);
		System.out.println("spaces are "+(a-1));
	}
}
public class CountWord {

	public static void main(String[] args) {
		word obj=new word();
		obj.getData();

	}

}
