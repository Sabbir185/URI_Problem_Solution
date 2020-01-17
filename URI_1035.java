import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		int A,B,C,D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int p = -1 ;
		int x = Math.abs(A);
		
		if ( B>C && D>A && C+D>A+B ) {
			
			if (  C!=p && D!=p ) {
				
				if( A == x ) {
					
					System.out.println( "Valores aceitos" );
				
				}
			}
		}
		else {
			System.out.println("Valores nao aceitos");
		}
 
    }
 
}
