import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		int n,count=2;
	    n = scanner.nextInt();
	    for(int i=0; i<10000; i+=n )
	    {
	        System.out.println(i+count);
	    }

 
    }
 
}
