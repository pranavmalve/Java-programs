class student1 {
	 int id;
	 String name ;
	 
	 
	 student1(int i,String n)
	 {
		 id=i;
		 name=n;
	 }
	 void display() 
	 {
		 System.out.println(id +" " +name);
	 }
	 	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 s1 = new student1(1,"Ash");
		student1 s2 = new student1(2,"Brock");

		s1.display();
		s2.display();
	}

}

//parameter constructor here the user defines the parameter
