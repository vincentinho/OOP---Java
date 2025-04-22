import java.util.Scanner;
import java.lang.Math;

public class exercicio5{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ponto 2D: ");
        int p1x = scanner.nextInt();
        int p1y = scanner.nextInt();

        System.out.println("Digite um ponto 2D: ");
        int p2x = scanner.nextInt();
        int p2y = scanner.nextInt();

        System.out.println("Digite um ponto 2D: ");
        int p3x = scanner.nextInt();
        int p3y = scanner.nextInt();
    
        float norma1 = (float)Math.sqrt(Math.pow((p1x - p2x), 2) + Math.pow((p1y - p2y), 2));
        float norma2 = (float)Math.sqrt(Math.pow((p1x - p3x), 2) + Math.pow((p1y - p3y), 2));
        float norma3 = (float)Math.sqrt(Math.pow((p3x - p2x), 2) + Math.pow((p3y - p2y), 2));
        
        System.out.printf("%f %f %f",norma1, norma2, norma3);

        if (norma1 == norma2 && norma2 == norma3){
            System.out.println("É um triangulo equilatero");
        } else if (norma1 == norma2 || norma2 == norma3 || norma1 == norma3){
            System.out.println("É um triangulo isosceles");
        } else System.out.println("É um triangulo escaleno");

        scanner.close();
    }
}
