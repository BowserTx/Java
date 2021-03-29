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
 
        
        int total = 0;
        Scanner leia = new Scanner(System.in);
        
        int a = leia.nextInt();
        total = total +(a *300);
        a = leia.nextInt();
        total = total +(a *1500);
        a = leia.nextInt();
        total = total +(a *600);
        a = leia.nextInt();
        total = total +(a *1000);
        a = leia.nextInt();
        total = total +(a *150);
        
        total =total +225;
        
        System.out.println(""+total);
 
    }
 
}