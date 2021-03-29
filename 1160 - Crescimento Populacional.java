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
        int aux;
        int t = leia.nextInt();
        
        for(; t>0; t--)
        {
            int cont=0;
            int pa = leia.nextInt();
            int pb = leia.nextInt();
            double ga = leia.nextDouble();
            double gb = leia.nextDouble();
        
            if(pa > pb)
                System.out.println("0 anos."); 
            if(pa <= pb)
            {
                while(pa <= pb)
                        {
                                aux = (int) (pa * (ga/100));
                                pa = aux + pa;
                                aux = (int) (pb * (gb/100));
                                pb = aux + pb;
                                cont++;
                        }
            }
              if(cont <= 100 && cont >= 1)
                  System.out.println(cont +" anos.");
                if(cont > 100)
                    System.out.println("Mais de 1 seculo.");
        }    
 
    }
 
}