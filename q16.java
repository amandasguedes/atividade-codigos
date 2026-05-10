import java.util.Locale;
import java.util.Scanner;
public class q16 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc=new Scanner(System.in);
        System.out.print("digite a medida da glicose:");
        double glicose=sc.nextDouble();
        System.out.print("classificacao: ");
        if (glicose<= 100.0) {
            System.out.println("normal");
        } else if (glicose<=140.0) {
            System.out.println("elevado");
        } else {
            System.out.println("diabetes");
        }
        sc.close();
    }
}
