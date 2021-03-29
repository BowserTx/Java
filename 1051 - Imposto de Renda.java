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
 
                    double ir = 0;
            Scanner leia = new Scanner(System.in);
           double valor = leia.nextDouble();
          

            
            if (valor > 4500)
            {
                ir += (valor - 4500) * 0.28;
                valor = 4500;

            }
            if (valor > 3000)
            {
                ir += (valor - 3000) * 0.18;
                valor = 3000;

            }
            if (valor > 2000)
            {
                ir += (valor - 2000) * 0.08;
            }
            if (ir == 0)
            {
                System.out.println("Isento");
                

            }
            else
                System.out.printf("R$ %.2f\n", ir);
 
    }
 
}