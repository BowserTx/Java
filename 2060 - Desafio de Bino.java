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
 
 int numero, m2=0, m3=0, m4=0, m5=0, n;
                
    Scanner leia = new Scanner(System.in);
        n = leia.nextInt();
        for(; n>0; n--)
        {
                numero = leia.nextInt();
                if(numero%2==0)
                        m2++;
                if(numero%3==0)
                        m3++;
                if(numero%4==0)
                        m4++;
                if(numero%5==0)
                        m5++;
        }
        System.out.println(m2+" Multiplo(s) de 2");
        System.out.println(m3+" Multiplo(s) de 3");
        System.out.println(m4+" Multiplo(s) de 4");
        System.out.println(m5+" Multiplo(s) de 5");
 
    }
 
}