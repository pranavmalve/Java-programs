
public class callmethodinsameclasss {

	public static void main(String[] args) {
		printOne();
		printOne();
		printtwo();

	}
	public static void printOne() {
		System.out.println("Hello World");
	}
	public static void printtwo() {
		printOne();
		printOne();
	}
	
}
