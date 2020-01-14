import java.io.IOException;
import java.util.Scanner;
import java.util.Stack; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[20];
        for (int i = 0; i < arr.length ; i++) {
            stack.push(arr[i] = scanner.nextInt());
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("N["+i+"] = "+stack.pop() );
        }
 
    }
 
}
