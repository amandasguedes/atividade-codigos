import java.util.Locale;
import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o nome:");
        String nome = sc.nextLine();
        System.out.print("digite o valor por hora:");
        double valorph= sc.nextDouble();
        System.out.print("digite as horas trabalhadas:");
        int ht= sc.nextInt();
        double pagamento=valorph*ht;
        System.out.printf("o pagamento para %s deve ser %.2f%n", nome, pagamento);
        sc.close();
    }
}
