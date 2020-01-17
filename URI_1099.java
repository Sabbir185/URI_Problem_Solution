import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int x,y,temp,sum;
		
		for (int i = 0; i < N; i++) {
			
			x = scanner.nextInt();
			y = scanner.nextInt();
			
			if ( x > y ) {   
				temp = x ;
				x = y ;
				y = temp ;
			}
			sum = 0 ;
			
			for (int j = x+1 ; j < y ; j++) {
				
				if ( j%2 != 0 ) {
					
					sum += j ;
				}
			}
			System.out.println(sum);
		}
 
    }
 
}
