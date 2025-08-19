import java.util.Scanner;

public class Ex16 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nota: ");
    double n = sc.nextDouble();
    if (n >= 7) System.out.println("Aprovado");
    else if (n >= 3) System.out.println("Em Exame");
    else System.out.println("Reprovado");
    sc.close();
}

}
