import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n<=0) {
        	System.out.println("invalid size");
        }
        else {
        	boolean flag = false;
        	int arr[] = new int[n];
        	for(int i =0;i<n;i++) {
        		arr[i]=scan.nextInt();
        		if(arr[i]==0) {
        		flag = true;
        		System.out.println("0 is invalid");
        		}
        	}
        	
        	if(flag == false) {
        	
        	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            
            //checking every element of the inputArray
             
            for (int i : arr) 
            {
                if(map.containsKey(i))
                {
                    
                     
                    map.put(i, map.get(i)+1);
                }
                else
                {                 
                    map.put(i, 1);
                }
            }
            
            //ArrayList<Integer> unique = new ArrayList<Integer>();
            //ArrayList<Integer> nonunique = new ArrayList<>();
            for(int j =0;j<n;j++) {
            	if(map.get(arr[j])>1) {
            		arr[j]=arr[j];
            	}
            	else {
            	arr[j]*=-1;;
            	}
            }
            
            int diff = arr[0];
            for(int i =1;i<n;i++) {
            	diff+=-1*arr[i];
            }
            
            System.out.println(diff);
            
        }//end of else
        	
        }
        
        int fn_ans = check_fn(0);
        System.out.println(fn_ans);
	}

	public static int check_fn(int x) {
		for(int i =0;i<=10;i++) {
			x+=1;
			System.out.println(x);
		}
		return x;
	}

}
