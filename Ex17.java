import java.util.Scanner;

public class Ex17 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nota 1: ");
    double n1 = sc.nextDouble();
    System.out.print("Nota 2: ");
    double n2 = sc.nextDouble();
    double m = (n1 + n2)/2.0;
    String conceito;
    if (m >= 9.0) conceito = "A";
    else if (m >= 7.5) conceito = "B";
    else if (m >= 6.0) conceito = "C";
    else if (m >= 4.0) conceito = "D";
    else conceito = "E";
    System.out.println("Notas: " + n1 + ", " + n2 + " | Média: " + m + " | Conceito: " + conceito);
    if ("ABC".contains(conceito)) System.out.println("APROVADO"); else System.out.println("REPROVADO");
    sc.close();
}

}
