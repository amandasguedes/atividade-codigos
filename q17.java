import java.util.Locale;
import java.util.Scanner;

public class q17 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as tres distancias:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        double maior;

        // Lógica para encontrar a maior distância
        if (d1 >= d2 && d1 >= d3) {
            maior = d1;
        } else if (d2 >= d3) {
            maior = d2;
        } else {
            maior = d3;
        }

        System.out.printf("MAIOR DISTANCIA = %.2f%n", maior);

        sc.close();
    }
}
