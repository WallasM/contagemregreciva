import java.util.Scanner;

public class Do_While_Regressivo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor maximo da contagem: ");
        int N = sc.nextInt();
        int i = N;
        do{
            System.out.println(i);
            i--;
        } while(i >= 0);
        sc.close(); 
    }
}

