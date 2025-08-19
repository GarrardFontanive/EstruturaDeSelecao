import java.util.Scanner;

public class Ex04 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um ano (4 dígitos): ");
    int ano = sc.nextInt();
    boolean bis = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    System.out.println(ano + (bis ? " é bissexto" : " não é bissexto"));
    sc.close();
}

}
