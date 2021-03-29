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
 
        
      int coelho=0, rato=0, sapo=0, caso=0, cobaia, quantidade=0;
      
      
      Scanner leia = new Scanner(System.in);
      
      caso = leia.nextInt();
      
      
      for(; caso > 0; caso --)
      {
          cobaia = leia.nextInt();
          String sigla = leia.next();
          
          quantidade += +cobaia;
          
          if(sigla.equals("C"))
          {
              coelho += +cobaia;
          }
          else if(sigla.equals("R"))
          {
              rato += +cobaia;
          }
          else if(sigla.equals("S"))
          {
              sapo += +cobaia;
          }
          
      }
      
      System.out.println("Total: "+quantidade+" cobaias");
      System.out.println("Total de coelhos: " + coelho);
      System.out.println("Total de ratos: " + rato);
      System.out.println("Total de sapos: " +sapo);
            
      double q_c = ( coelho * 100.00)/quantidade;
      double q_r = ( rato * 100.00)/quantidade;
      double q_s = ( sapo * 100.00)/quantidade;
      
      System.out.printf("Percentual de coelhos: %.2f %%\n", q_c);
      System.out.printf("Percentual de ratos: %.2f %%\n", q_r);
      System.out.printf("Percentual de sapos: %.2f %%\n", q_s);
 
    }
 
}