import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		int count=0;
		float sum=0;
		float arr[]= new float[6];
		for( int i=0; i<6; i++ )
	    {
	        arr[i] = scanner.nextFloat();

	        if( arr[i] > 0)
	        {
	            count = count + 1 ;
	            sum = ( sum + arr[i] ) ;
	        }

	    }
	    System.out.printf("%d valores positivos\n",count);
	    System.out.printf("%.1f\n",sum/count);
 
    }
 
}
