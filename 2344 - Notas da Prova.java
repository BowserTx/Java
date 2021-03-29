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
    
    int media = leia.nextInt();
    
    if(media == 0)
            System.out.println("E");
     if(media >=1 && media<=35)
            System.out.println("D");
      if(media >=36 && media<=60)
            System.out.println("C");
      if(media >=61 && media<=85)
            System.out.println("B");
      if(media >=86 && media<=100)
            System.out.println("A");
    }
 
}