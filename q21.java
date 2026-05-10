import java.util.Locale;
import java.util.Scanner;
public class q21 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc=new Scanner(System.in);
        System.out.print("digite o salario:");
        double salario=sc.nextDouble();
        double porcentagem;
        if (salario<=1000.0) {
            porcentagem=20.0;
        } else if (salario<=3000.0) {
            porcentagem=15.0;
        } else if (salario<= 8000.0) {
            porcentagem=10.0;
        } else {
            porcentagem=5.0;
        }
        double aumento=salario*(porcentagem/100.0);
        double novo=salario+aumento;
        System.out.printf("novo salario = R$ %.2f%n", novo);
        System.out.printf("Aumento = R$ %.2f%n", aumento);
        System.out.printf("Porcentagem = %.0f %%%n", porcentagem);
        sc.close();
    }
}
