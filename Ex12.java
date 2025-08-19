import java.util.Scanner;

public class Ex12 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Salário: R$ ");
    double s = sc.nextDouble();
    double perc;
    if (s <= 280) perc = 0.20;
    else if (s <= 700) perc = 0.15;
    else if (s <= 1500) perc = 0.10;
    else perc = 0.05;
    double aumento = s * perc;
    double novo = s + aumento;
    System.out.printf("Salário antes: R$ %.2f\nPercentual: %.0f%%\nValor aumento: R$ %.2f\nNovo salário: R$ %.2f\n", s, perc*100, aumento, novo);
    sc.close();
}

}
