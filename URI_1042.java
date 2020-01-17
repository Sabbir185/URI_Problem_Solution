import java.io.IOException;
 
import java.util.Arrays;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
  	Scanner scanner = new Scanner(System.in);
		int a, b, c, t;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		int arr[] = { a, b, c };
		int temp[] = { a, b, c };

		Arrays.sort(arr);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

 
    }
 
}
