import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("digite dois numeros inteiros:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("sao multiplos");
        } 
        else {
            System.out.println("nao sao multiplos");
        }
        sc.close();
    }
}
