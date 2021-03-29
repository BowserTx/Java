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
        if(x%2==0)
            System.out.println("" +(x+2));
        else
            System.out.println("" +(x+1));
 
    }
 
}