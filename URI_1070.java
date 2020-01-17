import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		    int x = scanner.nextInt();
		    for( int i=x; i<=x+11; i++)
		    {
		        if( i%2 == 1 )
		        {
		            System.out.printf("%d\n",i);
		        }
		    }
 
    }
 
}
