import java.util.Scanner;

public class MinDisClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	    int min = Integer.MAX_VALUE;
	    
	    Product prod[] = new Product[n];
	    for(int i = 0;i<n;i++) {
	    	String line = scan.next();
	    	String arr[] = line.split(",");
	    	String name = arr[0];
	    	int price = Integer.parseInt(arr[1]);
	    	int dis_per = Integer.parseInt(arr[2]);
	    	int total_dis = (price*dis_per)/100;
	    	if(total_dis<min) {
	    		min = total_dis;
	    	}
	    	prod[i]=new Product(name,price,dis_per,total_dis);
	    	scan.nextLine();
	    }
	    
	    for(int i =0;i<n;i++) {
	    	if(prod[i].total_dis==min) {
	    		System.out.println(prod[i].name+": "+min);
	    	}
	    }
	}

}

class Product{
	String name;
	int price;
	int dis_per;
	int total_dis;
	
	Product(String name,int price,int dis,int total_dis){
		this.name = name;
		this.price= price;
		this.dis_per = dis;
		this.total_dis = total_dis;
	}
}
