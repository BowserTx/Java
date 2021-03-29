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
 
String vertebra, especie, classe;
        
        Scanner leia = new Scanner(System.in);
        
         vertebra = leia.next();
         especie = leia.next();
         classe = leia.next();
        
        if(vertebra.equals("vertebrado"))
        {
            if(especie.equals("ave"))
            {
                if(classe.equals("carnivoro"))
                {
                    System.out.println("aguia");
                }
                else
                {
                    System.out.println("pomba");
                }
            }
            else
            {
                if(classe.equals("onivoro"))
                {
                    System.out.println("homem");
                }
                else
                {
                    System.out.println("vaca");
                }
                    
            }
        }
        else
        {
           if(especie.equals("inseto"))
           {
               if(classe.equals("hematofago"))
               {
                   System.out.println("pulga");
               }
               else
                {
                    System.out.println("lagarta");
                }
           }
           else
           {
               if(classe.equals("hematofago"))
               {
                   System.out.println("sanguessuga");
               }
               else
                {
                    System.out.println("minhoca");
                }
           }
        }
           
           
       
       
       
       
    }
 
}