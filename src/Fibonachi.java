import java.util.Scanner;

public class Fibonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("enter number of terms");
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         FibSequence(n);
        
		
	}
	
	public static void FibSequence(int n)
	{
		int first = 0;
		int second = 1;
		for(int i =1;i<=n;i++)
		{
			System.out.println(first);
			int third = first+second;
			first = second;
			second= third;
		}
	}

}
