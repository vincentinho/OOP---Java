import java.util.Scanner;

public class exercicio3{
    public static void main(String args[]){
        System.out.println("Digite um tempo em segundos: ");
        Scanner scanner = new Scanner(System.in);
        int segundos = scanner.nextInt();

        int horas = segundos/3600;
        segundos -= 3600 * horas;

        int minutos = segundos/60;
        segundos -= minutos * 60;
        
        System.out.println("Horas: " + horas + " | Minutos: " + minutos + " | Segundos: " + segundos);
        scanner.close();
    }
}
