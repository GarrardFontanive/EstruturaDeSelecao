import java.util.Scanner;

public class Ex30 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Litros: "); double l = sc.nextDouble();
    System.out.print("Tipo (A-álcool, G-gasolina): "); char t = sc.next().toUpperCase().charAt(0);
    double price = t=='G' ? 2.50 : 1.90;
    double desconto = 0;
    if (t=='A') desconto = l <= 20 ? 0.03 : 0.05;
    else if (t=='G') desconto = l <= 20 ? 0.04 : 0.06;
    double total = price * l * (1 - desconto);
    System.out.printf("Valor a pagar: R$ %.2f\n", total);
    sc.close();
}

}
