import java.util.Scanner;

public class exercicio2{
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in); 
        int num;
        do{
            System.out.println("Digite o termo de fibonacci: ");
            num = scanner.nextInt();
        }while(num<0);
        
        int primeiro = 0;
        int segundo = 1;

        if(num == 0){
            System.out.println("0");
        }else if(num == 1){
            System.out.println("0, 1");
        }else{
            System.out.println("0");
            System.out.println("1");
            int tmp;
            for(int i = 0; i<(num-1); i++){
                tmp = segundo;
                segundo += primeiro;
                System.out.println(segundo);
                primeiro = tmp;
            }
        }

        scanner.close();
    }
}
