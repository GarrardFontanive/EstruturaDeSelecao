import java.util.Scanner;

public class Ex01 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    double a = sc.nextDouble();
    System.out.print("Digite o segundo número: ");
    double b = sc.nextDouble();
    if (a > b) System.out.println("O maior é: " + a);
    else if (b > a) System.out.println("O maior é: " + b);
    else System.out.println("São iguais.");
    sc.close();
}

}
