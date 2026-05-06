import java.ultil.Scanner;
public class exemp02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("digite a base do retângulo:");
        double base=sc.nextDouble();
        System.out.print("digite a altura:");
        double altura=sc.nextDouble();
        double area=base*altura;
        double perimetro=2*base+altura;
        double diagonal=Math.sqrt(base*base+altura*altura);
        System.out.printf("area=%.4f%n", area);
        Sytem.out.printf("perimetro=%.4f%n", perimetro);
        System.out.printf("diagonal=%.4f%n", diagonal);
        sc.close();
    }
}
