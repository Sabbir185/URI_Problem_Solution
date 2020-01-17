import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		int x, y, temp, sum;

		while (true) {
			x = scanner.nextInt();
			y = scanner.nextInt();

			if (x == y)
				break;

			else if (x > y) {
				System.out.println("Decrescente");
			} else
				System.out.println("Crescente");
		}
 
    }
 
}
