import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Basic info:");
		System.out.println("Programme will Terminate if You press x or X");
		System.out.println("For operation please press + or - or * or / or %");
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("please Enter operator");
			char ch = scan.next().trim().charAt(0);
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%' ) {
				System.out.println("enter operands");
				double num1 = scan.nextDouble();
				double num2 = scan.nextDouble();
				double ans = 0;
				switch (ch){
				
				case '+':
					ans = num1+num2;
					System.out.println("Ans is = "+ans);
					break;
				case '-':
					ans = num1-num2;
					System.out.println("Ans is = "+ans);
					break;
				case '*':
					ans = num1*num2;
					System.out.println("Ans is = "+ans);
					break;
				case '/':
					if(num2==0) {
						System.out.println("num2 can't be 0");
						break;
					}
					else {
						ans = num1/num2;
						System.out.println("Ans is = "+ans);
						break;
					}
		
				case '%':
					ans = num1%num2;
					System.out.println("Ans is = "+ans);
					break;
				default:
					break;
				}//end of switch
				
				
			}//end of if
			else if(ch=='x' || ch=='X') {
				System.out.println("closed");
				scan.close();
				break;
			}
			else {
				System.out.println("Invalid Choice");
			}
		}//end of while
		
		

	}//end of main metod

}//end of main class
