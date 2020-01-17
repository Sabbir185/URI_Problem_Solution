import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       	Scanner sc = new Scanner(System.in);
		double A,B,C,pie=3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double TRIANGULO = (0.5)*(A*C);
		double CIRCULO = pie*(C*C);
		double TRAPEZIO = (0.5)*(A+B)*C;
		double QUADRADO = ( B*B );
		double RETANGULO = ( A*B );
		
		System.out.printf("TRIANGULO: %.3f\n",+TRIANGULO);
		System.out.printf("CIRCULO: %.3f\n",+CIRCULO);
		System.out.printf("TRAPEZIO: %.3f\n",+TRAPEZIO);
		System.out.printf("QUADRADO: %.3f\n",+QUADRADO);
		System.out.printf("RETANGULO: %.3f\n",+RETANGULO);
    }
 
}
