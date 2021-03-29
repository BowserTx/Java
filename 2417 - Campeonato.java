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
 
        int cv, ce, cs, fv, fe, fs;
        
        Scanner leia = new Scanner(System.in);
        
        cv = leia.nextInt();
        ce = leia.nextInt();
        cs = leia.nextInt();
        fv = leia.nextInt();
        fe = leia.nextInt();
        fs = leia.nextInt();
        
        
        cv = cv*3;
        cv = cv + ce;
        
        fv = fv*3;
        fv = fv+fe;
        
        if(cv > fv)
            System.out.println("C");
        else if(cv < fv)
            System.out.println("F");
        else if(cv == fv)
        {
            if(cs > fs)
                System.out.println("C");
            else if(cs < fs)
                System.out.println("F");
            else if(cs == fs)
                System.out.println("=");
                     
        }
    }
 
}