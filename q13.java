import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("primeiro valor:");
        int a=sc.nextInt();
        System.out.print("segundo valor:");
        int b=sc.nextInt();
        System.out.print("terceiro valor:");
        int c=sc.nextInt();
        int menor;
        if (a<=b && a<=c) {
            menor=a;
        } else if (b<=c) {
            menor=b;
        } else {
            menor=c;
        }
        System.out.println("menor="+menor);
        sc.close();
    }
}
