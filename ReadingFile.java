import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class ReadingFile {

	public static void main(String[] args) {
	try
	{
		System.out.println("updated");
	FileWriter fileWriter=new FileWriter("D://java/Pledge.txt");
	BufferedWriter bw=new BufferedWriter(fileWriter);
	bw.write("******INDIA PLEDGE*******");
	bw.newLine();
	bw.write("India is my country. All Indians are my brothers and sisters. ");
	bw.newLine();
	bw.write("I love my country and I am proud of its rich and varied heritage.");
	bw.newLine();
	bw.write("I shall always strive to be worthy of it.");
	bw.newLine();
	bw.write("I shall give my parents, teachers and all elders respect and treat everyone with courtesy.");
	bw.newLine();
	bw.write("To my country and my people, I pledge my devotion.");
	bw.newLine();
	bw.write("In their well being and prosperity alone, lies my happiness.");
	bw.close();
	}
	catch(IOException e)
	{
		System.out.println("exception occured");
	}
	}

}
