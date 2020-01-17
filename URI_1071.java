import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int sum=0;
		if( x<y )
	    {
	        for( int i=x+1; i<y; i++ )
	        {
	            if( i%2==1 || i%2==-1)
	            {
	                sum+=i;
	            }
	        }
	    }
	    else
	    {
	        for( int i=y+1; i<x; i++)
	        {
	            if( i%2==1 || i%2==-1 )
	            {
	                 sum+=i;
	            }
	        }
	    }
		System.out.printf("%d\n",sum);
 
    }
 
}
