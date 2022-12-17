
package inheritance;

class Vehicle {
 String color;
 int size;
 int speed;
 
 void attributes() {
	 System.out.println("color is :"+color);
	 System.out.println("speed is :"+speed);
	 System.out.println("size is :"+size);
	 
	 
 } 
 }
	class car extends Vehicle{
	
	int CC;
	int gears;
	 void attributescase() {
		 
		 
		 System.out.println("color is :"+color);
		 System.out.println("speed is :"+speed);
		 System.out.println("size is :"+size);
		System.out.println("Cc is :"+ CC);
		System.out.println("gear :"+ gears);
		 
	 }
	}
public class test {

	public static void main(String[] args) {
		car c1=new car();
		c1.color="blue";
		c1.speed=240;
		c1.size=22;
		c1.CC=100;
		c1.gears=5;
		
		c1.attributescase();
	}

}
