// (nome, preço e quantidade

import java.util.Scanner;

public class exercicio6{
    public static void main(String args[]){
        System.out.println("Insira a quantidade de produtos e preço, respectivamente ");
        Scanner scanner = new Scanner(System.in);

        int qtd = scanner.nextInt();
        int preco = scanner.nextInt();
        float tot = qtd * preco;

        if(qtd <= 10){
            System.out.println("Preco total é " + tot);
        }else if(qtd >= 11 && qtd <= 20){
            System.out.println("Preco total é " + tot*0.9);
        }else if(qtd >= 21 && qtd <= 50){
            System.out.println("Preco total é " + tot*0.8);
        }else if(qtd > 50){
            System.out.println("Preco total é " + tot*0.75);
        }

        scanner.close();
    }
}
