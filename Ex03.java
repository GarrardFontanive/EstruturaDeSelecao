import java.util.Scanner;

public class Ex03 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite F ou M: ");
    String s = sc.next().trim().toUpperCase();
    if (s.equals("F")) System.out.println("F - Feminino");
    else if (s.equals("M")) System.out.println("M - Masculino");
    else System.out.println("Entrada inválida");
    sc.close();
}

}
