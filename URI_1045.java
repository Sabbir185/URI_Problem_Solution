import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner scanner = new Scanner(System.in);

		double []a = new double[3];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextDouble();
		}
		
		double temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if ( a[j] > a[i] ) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		double A = a[0];
		double B = a[1];
		double C = a[2];
		
		if ( A >= B + C ) {
			System.out.printf("NAO FORMA TRIANGULO\n");
		}
		else if ( A*A > B*B + C*C ) {
			System.out.printf("TRIANGULO OBTUSANGULO\n");
		}
		
		if ( A*A == B*B + C*C ) {
			System.out.printf("TRIANGULO RETANGULO\n");
		}
		
		if ( A*A < B*B + C*C ) {
			System.out.printf("TRIANGULO ACUTANGULO\n");
		}
		
		if ( A == B && B == C && A == C ) {
			System.out.printf("TRIANGULO EQUILATERO\n");
		}
		
		if ( ((A == B) && (A!=C))  || (( A==C)&&(A!=B)) || ((B==C)&&(B!=A))  ) {
			System.out.printf("TRIANGULO ISOSCELES\n");
		}
 
    }
 
}
