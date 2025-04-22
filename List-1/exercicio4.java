import java.util.Scanner;

public class exercicio3{
    public static void main(String args[]){
        System.out.println("Digite quantos centavos: ");
        Scanner scanner = new Scanner(System.in);
        int cents = scanner.nextInt();
        
        System.out.println("Você tem " + cents/20000 + " notas de 200 reais");
        cents -= 20000*(cents/20000);
        System.out.println("Você tem " + cents/10000 + " notas de 100 reais");
        cents -= 10000*(cents/10000);
        System.out.println("Você tem " + cents/5000 + " notas de 50 reais");
        cents -= 5000*(cents/5000);
        System.out.println("Você tem " + cents/2000 + " notas de 20 reais");
        cents -= 2000*(cents/2000);
        System.out.println("Você tem " + cents/1000 + " notas de 10 reais");
        cents -= 1000*(cents/1000);
        System.out.println("Você tem " + cents/500 + " notas de 5 reais");
        cents -= 500*(cents/500);
        System.out.println("Você tem " + cents/200 + " notas de 2 reais");
        cents -= 200*(cents/200);
        System.out.println("Você tem " + cents/100 + " moedas de 1 real");
        cents -= 100*(cents/100);
        System.out.println("Você tem " + cents/50 + " moedas de 50 centavos");
        cents -= 50*(cents/50);
        System.out.println("Você tem " + cents/25 + " moedas de 25 centavos");
        cents -= 25*(cents/25);
        System.out.println("Você tem " + cents/10 + " moedas de 10 centavos");
        cents -= 10*(cents/10);
        System.out.println("Você tem " + cents/5 + " moedas de 5 centavos");
        cents -= 5*(cents/5);
        System.out.println("Você tem " + cents + " centavos sobrando");

        scanner.close();
    } 
} 
