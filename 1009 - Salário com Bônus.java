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
 
         
        double valor, comissao, bonus;
        String nome;
        
        Scanner total = new Scanner(System.in);
        nome = total.nextLine();

        valor = total.nextDouble();
        comissao = total.nextDouble();

        bonus = (double) (comissao * 0.15);
        
        bonus = (double) (valor+bonus);

            System.out.printf("TOTAL = R$ %.2f\n", bonus);
 
    }
 
}