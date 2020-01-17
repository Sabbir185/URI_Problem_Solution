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
 
       int n,i,j=1,k=2,l=3;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(i = 1;i <= n;i++){

            System.out.printf("%d %d %d\n",i,(i*i),(i*i*i));
        }
 
    }
 
}
