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
        int soma = 0;
        int caso = leia.nextInt();
        

      
        
        for(;caso > 0; caso--)
        {
           int a = leia.nextInt();
           int b = leia.nextInt();
           soma = 0;
           if(a%2 == 0)
               a= a+1;
           for(; b>0; b--)
           {
               soma+=a;
               a = a + 2;
           }
           System.out.println("" + soma);
    
      
        }
    }
 
}