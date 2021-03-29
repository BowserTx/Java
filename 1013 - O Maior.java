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
        
        int a = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();
        
        if(a > b && a > c)
                System.out.println(a+" eh o maior" );
        if(b > c && b > a)
                System.out.println(b+" eh o maior" );
        if(c > a && c > b)
               System.out.println(c+" eh o maior" );
 
    }
 
}