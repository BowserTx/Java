import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
  
 
 public static int[] geraVetor(){
        int[] vetor = new int[100];
        int j = 0;
        Scanner leia = new Scanner(System.in);
        for(int i=0; i<100;i++) {
            vetor[j] = leia.nextInt();
            
            if(vetor[j] == 0)
                break;
           j++; 
        }
        return vetor;
    }
 public static int imprimeVetor(int[] v) {
        int maior = 0;
        for (int i = 0; v[i] != 0; i++) {
            if(v[i] > maior)
                maior = v[i];
           // if ( (i+1)%10 == 0) {
               // System.out.println("");
            }
        return maior;
        }
        



    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {

        int[] vetor = geraVetor();
        
        Scanner leia = new Scanner(System.in);
        int maior = imprimeVetor(vetor);
        System.out.println(""+maior);
    

    }
    
}
