import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.IOException;
public class WriteOperation {

	public static void main(String[] args) {
			try
			{
			FileWriter obj=new FileWriter("D://java/TelanagaDis.txt");
			BufferedWriter tel=new BufferedWriter(obj);
			tel.write("    TELANGANA DISTICTS    ");
			tel.newLine();
			tel.write("===========================");
			tel.newLine();
			tel.write("1.Adilabad");
			tel.newLine();
			tel.write("2.komurambheem-asifabad");          
			tel.newLine();
			tel.write("3.mancheryal");
			tel.newLine();
			tel.write("4.nirmal");
			tel.newLine();
			tel.write("5.Nizamabad");									
			tel.newLine();
			tel.write("6.Kamareddy");
			tel.newLine();
			tel.write("7.karimnagar");
			tel.newLine();
			tel.write("8.rajanna-siricilla");
			tel.newLine();
			tel.write("9.jagityal");
			tel.newLine();
			tel.write("10.medak");
			tel.newLine();
			tel.write("11.siddipet");
			tel.newLine();
			tel.write("12.sangareddy");
			tel.newLine();
			tel.write("13.Warangal-urban");
			tel.newLine();
			tel.write("14.Warangal-rural");
			tel.newLine();
			tel.write("15.jangaon");
			tel.newLine();
			tel.write("16.mahaboobabad");
			tel.newLine();
			tel.write("17.Khammam");
			tel.newLine();
			tel.write("18.bhadradri-kothagudem");
			tel.newLine();
			tel.write("19.nalgonda");
			tel.newLine();
			tel.write("20.yadadri-bhuvanagiri");
			tel.newLine();
			tel.write("21.mahaboobnagar");
			tel.newLine();
			tel.write("22.nagarkurnool");
			tel.newLine();
			tel.write("23.jogulamba-gadwal");
			tel.newLine();
			tel.write("24.hyderabad ");
			tel.newLine();
			tel.write("25.peddapalli");
			tel.newLine();
			tel.write("26.Jayashankar-bhupalapalli ");
			tel.newLine();
			tel.write("27.rangareddy ");
			tel.newLine();
			tel.write("28.medchal-malkajgiri ");
			tel.newLine();
			tel.write("29.Suryapet  ");
			tel.newLine();
			tel.write("30.vikarabad");
			tel.newLine();
			tel.write("31.wanaparthi");
			tel.flush();
			tel.close();
			}
			catch(IOException e)
			{
				System.out.println("IOException occured");
			}
	}

}
