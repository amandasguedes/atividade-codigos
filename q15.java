import java.util.Locale;
import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc=new Scanner(System.in);
        System.out.print("digite o preço do produto:");
        double preco= sc.nextDouble();
        System.out.print("digite a quantidade comprada:");
        int quantidade=sc.nextInt();
        System.out.print("digite o inheiro recebido:");
        double dinheiro= sc.nextDouble();
        double valor= preco*quantidade;
        if (dinheiro>=valor) {
            double troco=dinheiro-valor;
            System.out.printf("TROCO = %.2f%n", troco);
        } else {
            double faltante=valor-dinheiro;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", faltante);
        }
        sc.close();
    }
}
