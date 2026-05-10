import java.util.Scanner;
public class q22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("hora inicial:");
        int hi=sc.nextInt();
        System.out.print("hora final:");
        int hf=sc.nextInt();
        int duracao;
        if (hi<hf) {
            duracao=hf-hi;
        } 
        else {
            duracao=(24-hi)+hf;
        }
        System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
        sc.close();
    }
}
