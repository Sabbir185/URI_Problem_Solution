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
        int N = scanner.nextInt();
        int []a = new int[N];
        int []b = new int[N];
        a[0]=0;
        a[1]=1;

        for (int i = 2; i <N ; i++) {

            a[i] = a[i-1]+a[i-2];
        }

        System.out.print(a[0]);
        for (int i = 1; i <N; i++) {
            System.out.print(" "+a[i]);
        }
        System.out.println();
 
    }
 
}
