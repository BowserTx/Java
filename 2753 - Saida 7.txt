import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        char c = 'a';
        for(int i=97; i<123; i++)
        {
            System.out.printf("%d e %c\n", i, c);
            c++;
        
        }
    }
 
}