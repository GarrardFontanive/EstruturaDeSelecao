import java.util.Scanner;

public class Ex09 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Altura (m): ");
    double h = sc.nextDouble();
    System.out.print("Peso atual (kg): ");
    double p = sc.nextDouble();
    System.out.print("Sexo (M/F): ");
    String s = sc.next().trim().toUpperCase();
    double ideal = s.equals("M") ? (72.7*h - 58) : (62.1*h - 44.7);
    System.out.printf("Peso ideal: %.2f\n", ideal);
    if (p > ideal) System.out.println("Acima do peso ideal");
    else if (p < ideal) System.out.println("Abaixo do peso ideal");
    else System.out.println("No peso ideal");
    sc.close();
}

}
