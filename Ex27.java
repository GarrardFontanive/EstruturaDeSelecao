import java.util.Scanner;

public class Ex27 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número: ");
    double x = sc.nextDouble();
    if (x == Math.floor(x)) System.out.println("Inteiro"); else System.out.println("Decimal");
    sc.close();
}

}
