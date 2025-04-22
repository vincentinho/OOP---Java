import java.util.Scanner;

public class converter{
    public static void main(String args[]){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Digite uma temperatura em celsius");
           int tempCelsius  = scanner.nextInt();
           double temFahren = (1.8 * tempCelsius) + 32;
           System.out.println("A temperatura correspondente em Fahrenheit é: " + temFahren);
           scanner.close()
    }
}
