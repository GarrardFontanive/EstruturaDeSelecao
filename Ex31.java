import java.util.Scanner;

public class Ex31 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Kg de morango: "); double m = sc.nextDouble();
    System.out.print("Kg de maçã: "); double a = sc.nextDouble();
    double priceM = m <= 5 ? 2.50 : 2.20;
    double priceA = a <= 5 ? 1.80 : 1.50;
    double total = m*priceM + a*priceA;
    if (m + a > 8 || total > 25) total *= 0.9;
    System.out.printf("Total a pagar: R$ %.2f\n", total);
    sc.close();
}

}
