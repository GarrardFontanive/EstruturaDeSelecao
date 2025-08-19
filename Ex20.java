import java.util.Scanner;

public class Ex20 {

public static void main(String[] args) {
    // mesma lógica do ex04
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um ano: ");
    int ano = sc.nextInt();
    boolean bis = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    System.out.println(ano + (bis ? " é bissexto" : " não é bissexto"));
    sc.close();
}

}
