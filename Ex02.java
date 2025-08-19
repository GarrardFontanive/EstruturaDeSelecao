import java.util.Scanner;

public class Ex02 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um valor: ");
    double v = sc.nextDouble();
    if (v > 0) System.out.println("Positivo");
    else if (v < 0) System.out.println("Negativo");
    else System.out.println("Zero");
    sc.close();
}

}
