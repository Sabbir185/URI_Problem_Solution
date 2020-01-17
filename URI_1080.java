import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
		int arr[] = new int[100];
		int maxNum = -1, ind=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (maxNum < arr[i]) {
				maxNum = arr[i];
				ind = i;
			}
		}
		System.out.println(maxNum);
		System.out.println(ind + 1);
 
    }
 
}
