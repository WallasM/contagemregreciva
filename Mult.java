import java.util.Scanner;
public class Mult{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("CONTAGEM REGRESSIVA");
        System.out.print( "Digite um numero: ");
        int N = sc.nextInt();
        for (int i = 1; i <= 10;i++){
            int mult = N * i;
           System.out.printf("%d * %d = %d\n", N, i, mult); 
            
        }

        sc.close();
    }
}
