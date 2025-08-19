import java.util.Scanner;

public class Ex08 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nota 1: ");
    double n1 = sc.nextDouble();
    System.out.print("Nota 2: ");
    double n2 = sc.nextDouble();
    double m = (n1 + n2)/2.0;
    System.out.println("Média: " + m);
    if (m >= 7) System.out.println("Aprovado");
    else System.out.println("Reprovado");
    sc.close();
}

}
