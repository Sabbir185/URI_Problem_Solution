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
 
        int n,a,b,c;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i=1;i<=n;i++)
        {
            a=i;
            b=i*i;
            c=i*i*i;
            System.out.println(a+" "+b+" "+c);
            b++;
            c++;
            System.out.println(a+" "+b+" "+c);
        }
 
    }
 
}
