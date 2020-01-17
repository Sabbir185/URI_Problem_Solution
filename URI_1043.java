import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		float a,b,c,Perimetro=0,Area=0;
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		c = scanner.nextFloat();
		
		if( b+c > a && a+c>b && a+b>c )
		{
			Perimetro = a + b + c ;
			System.out.printf("Perimetro = %.1f\n",Perimetro);
		}
		else {
				Area = ( (a+b)/2 ) * c;
				System.out.printf("Area = %.1f\n",Area);
		}
 
    }
 
}
