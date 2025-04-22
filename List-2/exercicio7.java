import java.util.Scanner;

public class exercicio7{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int num = scanner.nextInt();
        
        System.out.println("Digite o inferior e o superior do intervalo, respectivamente");
        int inf = scanner.nextInt();
        int sup = scanner.nextInt();

        if(num >= inf && num <= sup){
            System.out.println("O numero esta dentro do intervalo");
        }else if(num < inf){
            System.out.println("O numero está antes do intervalo");
        }else{
            System.out.println("O numero está depois do intervalo");
        }

        scanner.close();
    }
}