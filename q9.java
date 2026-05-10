import java.util.Locale;
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc=new Scanner(System.in);
        System.out.print("digite a medida A:");
        double a=sc.nextDouble();
        System.out.print("digite a medida B:");
        double b=sc.nextDouble();
        System.out.print("digite a medida C:");
        double c=sc.nextDouble();
        double areaq=a*a;
        double areat=(a*b)/2.0;
        double areaTr=((a+b)*c)/2.0;
        System.out.printf("quadrado= %.4f%n", areaq);
        System.out.printf("triangulo = %.4f%n", areat);
        System.out.printf("trapézio= %.4f%n", areatr);
        sc.close();
    }
}
