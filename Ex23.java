import java.util.Scanner;

public class Ex23 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Idade 1: "); int a = sc.nextInt();
    System.out.print("Idade 2: "); int b = sc.nextInt();
    System.out.print("Idade 3: "); int c = sc.nextInt();
    double m = (a + b + c) / 3.0;
    if (m < 25) System.out.println("Turma Jovem");
    else if (m <= 40) System.out.println("Turma Adulta");
    else System.out.println("Turma Idosa");
    sc.close();
}

}
