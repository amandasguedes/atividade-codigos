import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        System.out.print("digite o nome da 1° pessoa:");
        double nome1=sc.nextLine();
        System.out.print("digite a idade da 1°pessoa:");
        double idade1=sc.nextDouble();
        System.out.print("digite o nome da 2° pessoa:");
        double nome2=sc.nextLine();
        System.out.print("digite a idade da 2° pessoa:");
        double idade2=sc.nextDouble();
        double media=(idade1+idade2)/2;
        System.out.printf("media=%.1f%n", media);
        sc.close();
    }
}
