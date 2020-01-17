import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       float sum=0,j=1.0f;
        for (float i = 1; i <=39 ; i+=2) {
            sum = sum + (i/j);
            j*=2;
        }
        System.out.printf("%.2f\n",sum);
 
    }
 
}
