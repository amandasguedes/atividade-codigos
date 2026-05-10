import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite a duração em s:");
        int duracao=sc.nextInt();
        int horas=duracao/3600;
        int resto =duracao%3600;
        int minutos=resto/60;
        int segundos=resto%60;
        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
        sc.close();
    }
}
