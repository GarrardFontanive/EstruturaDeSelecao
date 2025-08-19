import java.util.Scanner;

public class Ex25 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Valor do saque (10-600): R$ ");
    int v = sc.nextInt();
    if (v < 10 || v > 600) { System.out.println("Valor inválido"); sc.close(); return; }
    int n100 = v / 100; v %= 100;
    int n50 = v / 50; v %= 50;
    int n10 = v / 10; v %= 10;
    int n5 = v / 5; v %= 5;
    int n1 = v;
    System.out.println("Notas de 100: " + n100);
    System.out.println("Notas de 50: " + n50);
    System.out.println("Notas de 10: " + n10);
    System.out.println("Notas de 5: " + n5);
    System.out.println("Notas de 1: " + n1);
    sc.close();
}

}
