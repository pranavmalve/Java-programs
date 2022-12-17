
public class student {
int rollno;
String name;
static String college= "RKT";

student(int r,String n)
{
	 rollno=r;
	 name=n;
}

void display() 
{
	 System.out.println(rollno +" " +name+" "+ college);
}
	
	
	public static void main(String[] args) {
		student s1 = new student(1,"Ash");
		student s2 = new student(2,"Brock");

		s1.display();
		s2.display();

	}

}
