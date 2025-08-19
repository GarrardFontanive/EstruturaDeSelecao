import java.util.Scanner;

public class Ex22 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Número (<1000): ");
    int n = sc.nextInt();
    int centenas = n / 100;
    int dezenas = (n % 100) / 10;
    int unidades = n % 10;
    System.out.println(n + " = " + centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidades");
    sc.close();
}

}
