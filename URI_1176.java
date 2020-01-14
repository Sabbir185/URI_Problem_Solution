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
        long []arr = new long[61];
        arr[0]=0;
        arr[1]=1;
        int n,t;
        n= scanner.nextInt();
        for (int i = 2; i <=60 ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        for (int i = 0; i <n ; i++) {
            t = scanner.nextInt();
            System.out.println("Fib("+t+") = "+arr[t]);
        }
 
    }
 
}
