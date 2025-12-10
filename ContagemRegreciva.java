import java.util.Scanner;
public class ContagemRegreciva{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("CONTAGEM REGRESSIVA");
        System.out.print( "Digite um numero: ");
        int N = sc.nextInt();
        for (int i = N; i > 0; i--){
            System.out.println(i);
        }

    


    }
}
