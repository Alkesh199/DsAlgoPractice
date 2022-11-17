
public class CowAndMen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 44;
       int m = 10;
       int y = -1;
       int x = -1;
       boolean flag = false;
       for(int i =0;i<=(n/2)+1;i++) {
    	   if(2*i+2*m==n) {
    		   y=m-i;
    		   if(y>=0) {
    			   flag = true;
    			   x=i;
    			   break;
    		   }
    	   }
       }
       if(flag) {
    	   System.out.println("Mens ="+y);
    	   System.out.println("Cow "+x);
    	   
       }
       else {
    	   System.out.print("invalid");
       }
       
	}

}
