import java.util.Scanner;

public class Ex06 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um inteiro: ");
    int n = sc.nextInt();
    if (n % 2 == 0) System.out.println("Transformado em ímpar: " + (n+1));
    else System.out.println("Transformado em par: " + (n-1));
    sc.close();
}

}
