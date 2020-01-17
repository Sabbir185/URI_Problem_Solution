import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		int a,b,x,y;
		float c,z;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextFloat();
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextFloat();
		
		float pager = ( b*c )+( y*z );
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",pager);
    }
 
}
