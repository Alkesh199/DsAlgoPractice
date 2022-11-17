import java.util.Arrays;
import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter total number of size ");
		
		/*int n = scan.nextInt();
		for(int j = 0;j<n;j++) {
			int num_ele = scan.nextInt();
		int arr[] = new int[num_ele];
		for(int i =0;i<num_ele;i++) {
			arr[i]= scan.nextInt();
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}*/
		
		
		/*
		String s1 = scan.next();
		String s2 = scan.next();
		char c1[] = s2.toLowerCase().toCharArray();
		char c2[] = s1.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("both string contains same char");
		}
		else {
			System.out.println("char are  diff");
		}
		*/
		
		//num rev
		/*boolean flag = false;
		int num = scan.nextInt();
		if(num<0) {
			flag = true;
			num*=-1;
		}
		
	
		int rev_num=0;
		while(num>0) {
			int dig = num%10;
			rev_num = rev_num*10+dig;
			num/=10;
		}
		
		if(flag)
		System.out.println(rev_num*-1);
		else {
			System.out.println(rev_num);
		}
		*/
		
		//freq_count
		String str = scan.next();
		str = str.toLowerCase();
		int freq[] = new int[26];
		for(int i =0;i<str.length();i++) {
			freq[(int)str.charAt(i)-97]+=1;
		}
		
		for(int i =0;i<str.length();i++) {
			System.out.println(str.charAt(i)+" "+freq[(int)str.charAt(i)-97]);
		}

	}

}
