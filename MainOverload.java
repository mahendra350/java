
public class MainOverload {

	public static void main(String[] args) {
	 System.out.println("main method 1");
	 main(4);
	 main("joker","king");
	}
	public static void main(int args1) {
		 System.out.println(+args1);
		}
	public static void main(String args1, String args2) {
		 System.out.println("main method 3");
		 
		}
}
