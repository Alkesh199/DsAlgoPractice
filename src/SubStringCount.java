import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubStringCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine().trim().toLowerCase();
        String str2 = br.readLine().trim().toLowerCase();
        
        int count = 0;
        if(str2.length()>str1.length()) {
        	count = 0;
        }
        else {
        	for(int i =0;i<=str1.length()-str2.length();i++){
        		if(str2.equals(str1.substring(i,i+str2.length()))) {
        			count++;
        		}
        		
        	}
        	
        }
        System.out.println(count);
	}

}
