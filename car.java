 class car {
	 	 final int speedlimit=90; //final variable//

	 	 void run() 
	 	 {
	 		 speedlimit=400;
	 		 
	 	 }
	 	 public static void main(String[] args) {
		car obj =new car();
		obj.run();
	}
 
}
//error appear bcoz final keyword i used.
 //we speed limit to 90
 //we cannot change it to 400.