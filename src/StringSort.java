import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int arr[] = new int[26];
        String req = "";
        for(int i =0;i<str.length();i++) {
        	arr[(int)str.charAt(i)-97]+=1;
        }
        
        for(int i =arr.length-1;i>=0;i--) {
        	for(int j =0;j<arr[i];j++) {
        		req+=(char)(i+97);
        	}
        }
        System.out.println(req);
       
	}

}
