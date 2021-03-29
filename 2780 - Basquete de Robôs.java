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
 
       int x;
        
        Scanner leia = new Scanner(System.in);
        
        x = leia.nextInt();
        
        if(x <= 2000 && x > 1400)
            System.out.println("3");
        else if(x <= 1400 && x > 800)
             System.out.println("2");
        else if(x <= 800)
             System.out.println("1");
    }
 
}