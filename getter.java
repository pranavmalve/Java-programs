 class Person{
	String name;
	int age;
	void speak() {
		System.out.print("My name is: "+ name);
	} 
	 int calculateYearsToretirenament() {
		 int yearsLeft = 65 -age;
		 return yearsLeft;
	 }
	 int getage() {
		 return age;
	 }
	 String getname() {
		 return name;
	 }
}





public class getter {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name=" Ash";
		person1.age=18;
	//person1.speak()
		
		int years=person1.calculateYearsToretirenament();
		
		System.out.print("Years to retirement is " + years);
		int age =person1.getage();
		String name =person1.getname();
		System.out.println("\n"+"Name is"+name);
		System.out.println("Age is "+age);
		

	}

}
