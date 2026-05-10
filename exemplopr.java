import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
public class exemplopr {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc=new Scanner(System.in);
        System.out.print("digite a largura do terreno:");
        double l=sc.nextDouble();
        System.out.print("digite o comprimento do terreno:");
        double c=sc.nextDouble();
        System.out.print("digite o valor do metro quadrado:");
        double valor=sc.nextDouble();
        double area=l*c;
        double p=area*valor;
        NumberFormat nf=NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println();
        System.out.printf("Area do terreno = %.2f%n", area);
        System.out.printf("Preco do terreno = %.2f%n", p);
        sc.close();
    }
}
