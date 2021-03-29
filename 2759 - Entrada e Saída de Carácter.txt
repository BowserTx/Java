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
 
        char x, y, z;
        
        Scanner leia = new Scanner(System.in);
        x = leia.next().charAt(0);
        y = leia.next().charAt(0);
        z = leia.next().charAt(0);
        
        System.out.println("A = "+x+", B = "+y+", C = "+z);
        System.out.println("A = "+y+", B = "+z+", C = "+x);
        System.out.println("A = "+z+", B = "+x+", C = "+y);
    }
 
}