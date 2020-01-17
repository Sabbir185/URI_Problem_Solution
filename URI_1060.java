import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		double n ;
		int count=0;
		
		for ( int i = 1; i <= 6; i++ ) 
		{
			n = scanner.nextDouble();
			if( n>0 )
			{
				count = count + 1 ;
			}
		}
		System.out.printf("%d valores positivos\n",count);
 
    }
 
}
