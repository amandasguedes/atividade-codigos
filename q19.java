import java.util.Locale;
import java.util.Scanner;
public class q19 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc=new Scanner(System.in);
        System.out.print("código do produto:");
        int codigo=sc.nextInt();
        System.out.print("quantidade:");
        int quantidade=sc.nextInt();
        double preco=0.0;
        if (codigo==1) {
            preco=5.00;
        } else if (codigo==2) {
            preco=3.50;
        } else if (codigo==3) {
            preco = 4.80;
        } else if (codigo==4) {
            preco = 8.90;
        } else if (codigo==5) {
            preco=7.32;
        } else {
            System.out.println("Código inválido!");
            sc.close();
            return;
        }
        double total=preco*quantidade;
        System.out.printf("Valor a pagar: R$ %.2f%n", total);
        sc.close();
    }
}