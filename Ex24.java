import java.util.Scanner;

public class Ex24 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nota 1: "); double n1 = sc.nextDouble();
    System.out.print("Nota 2: "); double n2 = sc.nextDouble();
    System.out.print("Nota 3: "); double n3 = sc.nextDouble();
    double m = (n1 + n2 + n3)/3.0;
    if (m == 10) System.out.println("Aprovado com Distinção (média 10)");
    else if (m >= 7) System.out.println("Aprovado (média: " + m + ")");
    else System.out.println("Reprovado (média: " + m + ")");
    sc.close();
}

}
