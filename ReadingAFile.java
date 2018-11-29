import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadingAFile {

	public static void main(String[] args) {
		try
		{
		FileReader fileReader=new FileReader("D://java/pledge.txt");
		BufferedReader br=new BufferedReader(fileReader);
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
			String s1[]=s.split("");
			int a=0;
			for(int i=0;i<s1.length;i++)
			{
				a++;
			}
			System.out.println("no of characters in file :"+a);
			String s2[]=s.split(" ");
			int b=0;
			for(int i=0;i<s2.length;i++)
			{
				b++;
			}
			System.out.println("no of characters in file :"+b);
			String s3[]=s.split("  ");
			int c=0;
			for(int i=0;i<s3.length;i++)
			{
				c++;
			}
			System.out.println("no of characters in file :"+c);
			}
		}
		
		catch(FileNotFoundException fn)
		{
			System.out.println("file not found");
		}
		catch(IOException e)
		{
			System.out.println("ioexception found");
		}
		

	}

}
