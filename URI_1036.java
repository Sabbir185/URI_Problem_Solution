import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
		double A, B, C, x, y, R1, R2;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		x = ((B * B) - (4 * A * C));

		if (x < 0) {

			System.out.println("Impossivel calcular");
		} else if (A == 0) {
			System.out.println("Impossivel calcular");
		} else {

			R1 = ((-B + Math.sqrt(((B * B) - (4 * A * C)))) / (2 * A));
			R2 = ((-B - Math.sqrt(((B * B) - (4 * A * C)))) / (2 * A));

			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		}

 
    }
 
}
