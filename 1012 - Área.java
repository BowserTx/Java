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
 
        double total;
        Scanner leia = new Scanner(System.in);
        
        double a = leia.nextDouble();
        double b = leia.nextDouble();
        double c = leia.nextDouble();
        


        System.out.printf("TRIANGULO: %.3f\n", total =(a * c)/2);
        System.out.printf("CIRCULO: %.3f\n", total = 3.14159 * (c * c));
        System.out.printf("TRAPEZIO: %.3f\n", total = (c * (a + b)) / 2);
        System.out.printf("QUADRADO: %.3f\n", total = b * b);
        System.out.printf("RETANGULO: %.3f\n", total = a * b);
 
    }
 
}