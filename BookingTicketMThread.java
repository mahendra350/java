class Booking extends Thread{
	int tickets=2;
	public void bookMyticket() {
		
		
		if(tickets>0){
			tickets--;
			System.out.println("waiting for payment "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
				} 
			catch (InterruptedException e)
				{
				e.printStackTrace();
				}
			System.out.println("successfuly booking  "+Thread.currentThread().getName());
			
		}
		else{
			System.out.println("sorry not available  "+Thread.currentThread().getName());
		}
		
	}
	
}
class Audiance extends Thread{
	Booking book;
	Audiance(Booking book)
		{
			this.book=book;
		}
	public void run()
		{
			book.bookMyticket();
		}
}
public class BookingTicketMThread {
	public static void main(String arg[]){
		Booking bk=new Booking();
		Audiance t1=new Audiance(bk);
		Audiance t2=new Audiance(bk);
		Audiance t3=new Audiance(bk);
		t1.start();
		t2.start();
		t3.start();
	}

}
