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
        
        int quantidade, codigo;
        double total;
        
        Scanner leia = new Scanner(System.in);
        
        codigo = leia.nextInt();
        quantidade = leia.nextInt();
        
        switch (codigo) {
            case 1:
                total = 4.00 * quantidade;
                break;
            case 2:
                total = 4.50 * quantidade;
                break;
            case 3:
                total = 5.00 * quantidade;
                break;
            case 4:
                total = 2.00 * quantidade;
                break;
            default:
                total = 1.50 * quantidade;
                break;
        }
        
        System.out.printf("Total: R$ %.2f\n", total);
    }
 
}