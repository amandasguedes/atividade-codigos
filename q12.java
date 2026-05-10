import java.util.Locale;
import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc=new Scanner(System.in);
        System.out.print("coeficiente a:");
        double a=sc.nextDouble();
        System.out.print("coeficiente b:");
        double b=sc.nextDouble();
        System.out.print("coeficiente c:");
        double c=sc.nextDouble();
        double delta=Math.pow(b, 2) - (4*a*c);
        if (a==0 || delta<0) {
            System.out.println("esta equacao nao possui raizes reais");
        } else {
            double x1=(-b + Math.sqrt(delta))/(2 * a);
            double x2=(-b - Math.sqrt(delta))/(2 * a);
            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f%n", x2);
        }

        sc.close();
    }
}
