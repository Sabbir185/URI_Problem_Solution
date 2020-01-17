import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner =new Scanner(System.in);
		int n = scanner.nextInt();
		int x,count=0,flag=0;
	    for( int i=1; i<=n; i++ )
	    {
	    	x = scanner.nextInt();
	        if( x>=10 && x<=20 )
	        {
	            count++ ;
	        }
	        else
	        {
	            flag++ ;
	        }
	    }
	    System.out.printf("%d in\n",count);
	  System.out.printf("%d out\n",flag);
 
    }
 
}
