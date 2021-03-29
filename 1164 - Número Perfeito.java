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
        
        int caso = leia.nextInt();
        int numero;
        int aux;
        int perfeito = 0;
        int i = 1;
        for(; caso>0; caso--)
        {
            numero = leia.nextInt();
            aux = numero;
            perfeito = 0;
            i = 1;
            while((numero/2) >= i)
                {
                        if((numero%i) == 0)
                        {
                                perfeito = perfeito + i;
                        }
                  i++;
                }
                if(aux == perfeito)
                        System.out.printf("%d eh perfeito\n", aux);
                else if(aux != perfeito)
                        System.out.printf("%d nao eh perfeito\n", aux);  
        }
 
    }
 
}