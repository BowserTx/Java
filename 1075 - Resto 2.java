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
 
        int n, mod, i;
        
        Scanner leia = new Scanner(System.in);
        
        n = leia.nextInt();
        
        for(i=0; i<10000; i++)
        {
            mod = i%n;
            
            if(mod == 2)
                System.out.println(i+"");
        }
    }
 
}