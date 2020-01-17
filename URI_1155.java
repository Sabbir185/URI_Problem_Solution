import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       double sum=0;
        for (float i = 1; i <=100 ; i++) {
            sum = sum + (1/i);
        }
        System.out.printf("%.2f\n",sum);
 
    }
 
}
