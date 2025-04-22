import java.util.Scanner;

public class gabarito{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        float num1 = scanner.nextFloat();
        System.out.println("Digite outro número: ");
        float num2 = scanner.nextFloat();
        
        float soma = num1 + num2;
        float sub = num1 - num2;
        float quociente = num1 / num2;

        scanner.close();

        System.out.println("Soma: " + soma + "\nSubtração: " + sub + "\nDivisão: " + quociente);
    }
}