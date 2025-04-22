import java.util.Scanner;

public class exercicio1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();
        
        int soma = num1 + num2;
        int sub = num1 - num2;
        int quociente = num1 / num2;

        System.out.println("Soma: " + soma + "\nSubtração: " + sub + "\nDivisão: " + quociente);
    }
}
