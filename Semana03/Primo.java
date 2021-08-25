import java.util.Scanner;

public class Primo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro maior que 1:");
        int n  = scan.nextInt();

        if (n < 2)
            System.out.println("não é primo!");
        else if (n == 2) System.out.println("é primo!");
        else {
            int i = 2;
            while (n % i != 0 && i <= n/2){
                i++;
            }
            if(n % i == 0)
                System.out.println("não é primo!");
            else 
                System.out.println("é primo!");
        }
    }
}