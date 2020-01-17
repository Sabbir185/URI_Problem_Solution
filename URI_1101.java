import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		int x, y, temp, sum;
		
		while (true) {
			x = scanner.nextInt();
			y = scanner.nextInt();

			if(x<=0 || y<=0)
				break;
			
			if (x > y) {
				temp = x;
				x = y;
				y = temp;
			}
			
			sum = 0 ;
			for (int j = x; j <= y; j++) {
				System.out.print(j + " ");
				sum += j;
			}
			System.out.println("Sum=" + sum);
		}
 
    }
 
}
