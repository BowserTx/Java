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
        
       int n[] = new int[20];
       int inverso[] = new int[20];
       int i, a;
        a = 19;
        for(i=0; i<20; i++)
                n[i] = leia.nextInt();
        for(i=0; i<20; i++)
        {
        inverso[a] = n[i];
        a--;
        }
        for(i=0; i<20; i++)
            System.out.printf("N[%d] = %d\n", i, inverso[i]);
    }
 
}