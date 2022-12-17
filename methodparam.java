
public class methodparam {
	public static void main(String[] args) {
		int a =11;
		int b=6;
		int c= minfunction(a,b);
		System.out.print("minimum value = "+c);
		
	}



//returns the minimum of two number
public static int minfunction(int n1,int n2) {
	int min;
	if(n1>n2)
		min=n2;
	else
		min=n1;
	
	return min;
}
}



