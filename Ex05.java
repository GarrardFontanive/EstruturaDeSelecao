import java.util.Scanner;

public class Ex05 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite uma letra: ");
    char c = sc.next().toLowerCase().charAt(0);
    if ("aeiou".indexOf(c) >= 0) System.out.println("Vogal");
    else System.out.println("Não é vogal");
    sc.close();
}

}
