import java.util.*;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int arr[] = new int[n];
       for(int i =0;i<n;i++) {
    	   arr[i]=scan.nextInt();
       }
       for(int i =0;i<arr.length;i++) {
    	   System.out.println(arr[i]);
       }
       
       Arrays.sort(arr);
       
       for(int i =0;i<arr.length;i++) {
    	   System.out.println(arr[i]);
       }
       
	}

}
