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
        
        Scanner leia = new Scanner(System.in);
        
       int n[] = new int[10];
       int i, x;
       x = leia.nextInt();
        n[0] = x;
        for(i = 1; i < 10; i++)
        {
                n[i] = x*2;
                x = x * 2;
        }
        for(i=0; i<10; i++)
                System.out.printf("N[%d] = %d\n", i, n[i]);
 
    }
 
}