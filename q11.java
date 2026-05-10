import java.util.Locale;
import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc=new Scanner(System.in);
        System.out.print("digite uma nota:");
        double n1=sc.nextDouble();
        System.out.print("digite a segunda nota:");
        double n2=sc.nextDouble();
        double nf=n1+n2;
        System.out.printf("nota final = %.1f%n", nf);
        if (nf<60.0) {
            System.out.println("REPROVADO");
        }
        sc.close();
    }
}
