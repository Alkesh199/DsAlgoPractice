import java.util.Scanner;

public class CheckingInstallation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int odd =0;
		int even = 0;
		int all_sum = 0;
		String sep_str = "";
		for(int i =0;i<str.length();i++) {
			int digit = Character.getNumericValue(str.charAt(i)); 
			all_sum+=digit;
			sep_str+=str.charAt(i)+" ";
			if(digit%2==0) {
				even+=1;
			}
			else {
				odd+=1;
			}
		}
		
		String str_out= sep_str.trim();
		
		
		
	    int numerlogy_num = 0;
	    while(str.length()>1) {
	    	numerlogy_num= 0;
	    	for(int i =0;i<str.length();i++) {
	    		numerlogy_num+=Character.getNumericValue(str.charAt(i)); 
	    	}
	    	str = String.valueOf(numerlogy_num);
	    }
		
	    System.out.println("sep str :"+str_out);
     System.out.println("Sum of digits:"+all_sum);
     System.out.println("Numerology number: "+numerlogy_num);
     System.out.println("Number of odd number:"+odd);
     System.out.println("Number of even number:"+even);
	}


}
