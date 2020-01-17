import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
	    if( input>=1 && input<=1000)
	    {
	        for( int i=1; i<=input; i=i+2 )
	        {
	            System.out.printf("%d\n",i);
	        }
	    }
 
    }
 
}
