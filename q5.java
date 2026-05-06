import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("preço do produto:");
        double preco= sc.nextDouble();
        System.out.print("quantidade comprada:");
        int quantidade = sc.nextInt();
        System.out.print("valor pago:");
        double valorp = sc.nextDouble();
        double valort = preco*quantidade;
        double troco = valorp - valort;
        System.out.println();
        if (troco >= 0) {
            System.out.printf("TROCO = %.2f%n", troco);
        } else {
            System.out.printf("FALTAM = %.2f%n", Math.abs(troco));
        }
        sc.close();
    }
}
