import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        System.out.print("digite um número:");
        double num1=sc.nextDouble();
        System.out.print("digite outro número:");
        double num2=sc.nextDouble();
        double soma=num1+num2;
        System.out.println("a soma é:"+ soma);
        sc.close();
    }
}
