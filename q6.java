import java.util.Locale;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o valor do raio: ");
        double r=sc.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("area= %.3f%n", area);
        sc.close();
    }
}
