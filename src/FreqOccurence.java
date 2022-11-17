import java.util.Scanner;

public class FreqOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		System.out.println("enter the number whic you want to check freq");
		int n = scan.nextInt();
		int ans = 0;
		while(num>0) {
			int d= num%10;
			num=num/10;
			if(d==n) {
				ans++;
			}
			
		}
		System.out.println("freq of "+n+" is = "+ans);

	}

}
