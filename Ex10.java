import java.util.Scanner;

public class Ex10 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite três números: ");
    double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
    double maior = Math.max(a, Math.max(b,c));
    double menor = Math.min(a, Math.min(b,c));
    System.out.println("Maior: " + maior + " | Menor: " + menor);
    sc.close();
}

}
