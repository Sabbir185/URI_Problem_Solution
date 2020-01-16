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
        int v,j=1;
        int []sum = new int[10];
        v = scanner.nextInt();
        for (int i = 0; i < sum.length ; i++) {
            sum[i] = v * j ;
            j+=j ;
        }
        for (int i = 0; i <sum.length ; i++) {
            System.out.printf("N[%d] = %d",i,sum[i]);
            System.out.println();
        }
 
    }
 
}
