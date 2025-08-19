import java.util.Scanner;

public class Ex26 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Inteiro: ");
    int n = sc.nextInt();
    System.out.println(n % 2 == 0 ? "Par" : "Ímpar");
    sc.close();
}

}
