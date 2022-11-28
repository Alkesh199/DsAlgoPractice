
public class Shadowing {

	 static int x = 30;//this will be shadowed at line 8
	 
	public static void main(String[] args) {
		System.out.println("x before Sadowing "+x);
		int x = 40;
		System.out.println("value of x after shadowing is:"+x);
		fun1();

	}
	
	public static void fun1() {
		System.out.println("Accessing x inside function value is :"+x);
	}

}
