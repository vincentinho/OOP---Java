import java.util.Scanner;

public class exercicio4{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kilometros percorridos: ");
        int kms = scanner.nextInt();
        System.out.println("Tempo gasto: ");
        int tempo = scanner.nextInt();
        System.out.println("Consumo em litros: ");
        int litros = scanner.nextInt();

        float velocidade = (float)kms/tempo;
        float consumo = (float)kms/litros;

        System.out.println("Velocidade média: " + velocidade + " | Consumo médio: " + consumo);

        scanner.close();
    }
}
