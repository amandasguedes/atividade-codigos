import java.util.Locale;
import java.util.Scanner;
public class q18 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc=new Scanner(System.in);
        System.out.print("digite a temperatura em qual escala (C/F)?");
        String escala=sc.next().toUpperCase();
        if (escala.equals("F")) {
            System.out.print("digite a temperatura em Fahrenheit:");
            double fahrenheit=sc.nextDouble();
            double celsius=(5.0/9.0)*(fahrenheit-32.0);
            System.out.printf("temperatura equivalente em Celsius: %.2f%n", celsius);
        } 
        else if (escala.equals("C")) {
            System.out.print("digite a temperatura em Celsius:");
            double celsius=sc.nextDouble();
            double fahrenheit=(9.0/5.0)*celsius+32.0;
            System.out.printf("temperatura equivalente em Fahrenheit: %.2f%n", fahrenheit);
        } 
        else {
            System.out.println("escala inválida! Use 'C' para Celsius ou 'F' para Fahrenheit.");
        }
        sc.close();
    }
}