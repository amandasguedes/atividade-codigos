import java.util.Locale;
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);
        System.out.print("digite a distancia:");
        int distancia = sc.nextInt();
        System.out.print("digite o combustível:");
        double combustivel = sc.nextDouble();
        double consumo= (double) distancia / combustivel;
        System.out.printf("consumo= %.3f%n", consumo);
        sc.close();
    }
}
