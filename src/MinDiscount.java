import java.util.Scanner;

public class MinDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String details[] = new String[n];
        for(int i =0;i<details.length;i++) {
        	details[i] = scan.next();
        	scan.nextLine();
        	
        }
        
        int min = Integer.MAX_VALUE;
      
        for(int i = 0;i<details.length;i++) {
        	 String arr[] = details[i].split(",");
        	int price = Integer.parseInt(arr[1]);
        	int dis_per = Integer.parseInt(arr[2]);
        	int dis = (price*dis_per)/100;
        	if(dis<min) {
        		min = dis;
        		
        	}
        }
        
        //for printing min discount products
        for(int i =0;i<details.length;i++) {
        	String arr[] = details[i].split(",");
        	int price = Integer.parseInt(arr[1]);
        	int dis_per = Integer.parseInt(arr[2]);
        	int dis = (price*dis_per)/100;
        	if(dis ==  min) {
        		System.out.println(arr[0]+" "+dis);
        	}
        }
        
        
	}

}
