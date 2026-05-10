import java.util.Locale;
import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc=new Scanner(System.in);
        System.out.print("quantidade de minutos:");
        int minutos = sc.nextInt();
        double valorPago = 50.0;
        if (minutos>100) {
            valorp+=(minutos-100)*2.0;
        }
        System.out.printf("valor a pagar: R$ %.2f%n", valorp);
        sc.close();
    }
}
