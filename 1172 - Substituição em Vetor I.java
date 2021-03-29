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
        
       int x[] = new int[10];
       int i;
       for(i=0; i<10; i++)
                x[i] = leia.nextInt();
        for(i=0; i<10; i++)
          {
                if(x[i] <= 0)
                        x[i] = 1;

              System.out.printf("X[%d] = %d\n", i, x[i]);

          }
 
    }
 
}