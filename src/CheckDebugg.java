
public class CheckDebugg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		int y = 5;
		int z = ++x + y++ + ++y;
		System.out.println(z);
		
		x = addition(y,z);
		 
		
		System.out.println("sum of y and z ="+x);

	}
	
	public static int addition(int x , int y) {
		x = x+6;
		y=y+5;
		return x++ + ++y;
		
	}

}
