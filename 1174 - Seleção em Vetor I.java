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
        double v[] = new double[100];
        int i;
        Scanner leia = new Scanner(System.in);
        
        double numero;
        
        
        for(i=0; i<100; i++)
        {
            numero = leia.nextDouble();
            v[i]=numero;
        }
        for(i=0; i<100; i++)
        {
           if(v[i]<=10)
                System.out.printf("A[%d] = %.1f\n", i, v[i]);
        }
    }
 
}