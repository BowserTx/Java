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
        int peca, quant;
        double valor = 0, soma = 0;
        
        Scanner total = new Scanner(System.in);
        
       for(int i = 0; i<=1; i++)
       {
        peca = total.nextInt();
        quant = total.nextInt();
        valor = total.nextDouble();
        
        soma = soma+(valor*quant);
        
       }
       System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);
        
        
    }
 
}