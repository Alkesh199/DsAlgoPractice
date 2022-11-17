import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int arr_ip[] = {2,7,11,15};
		int arr[] = twoSum(arr_ip,9);
		System.out.println(arr[0]+","+arr[1]);
	}
	 public static int[] twoSum(int[] nums, int target) {
	        HashMap<Integer,Integer> hm = new HashMap<>();
	        int arr[] = new int[2];
	        hm.put(arr[0],0);
	        for(int i =1;i<arr.length;i++){
	            int req=target-arr[i];
	            if(hm.containsKey(req)){
	                arr[0]=hm.get(req);
	                arr[1]=i;
	                System.out.println(hm.containsKey(req));
	                return arr;
	            }
	            else{
	                hm.put(arr[i],i);
	            }
	        }
	        return arr;
	    }

}
