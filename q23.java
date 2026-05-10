import java.util.Locale;
import java.util.Scanner;
public class q23{
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc=new Scanner(System.in);
        System.out.print("valor de X:");
        double x=sc.nextDouble();
        System.out.print("valor de Y:");
        double y=sc.nextDouble();
        if (x==0 && y==0) {
            System.out.println("origem");
        } 
        else if (x==0) {
            System.out.println("eixo Y");
        } 
        else if (y==0) {
            System.out.println("eixo X");
        } 
        else if (x>0 && y>0) {
            System.out.println("Q1");
        } 
        else if (x<0 && y>0) {
            System.out.println("Q2");
        } 
        else if (x<0 && y<0) {
            System.out.println("Q3");
        } 
        else {
            System.out.println("Q4");
        }
        sc.close();
    }
}
