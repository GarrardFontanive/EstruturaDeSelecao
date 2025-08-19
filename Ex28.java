import java.util.Scanner;

public class Ex28 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("A: "); double a = sc.nextDouble();
    System.out.print("B: "); double b = sc.nextDouble();
    System.out.print("Operação (+ - * /): "); char op = sc.next().charAt(0);
    double r = 0;
    switch(op) {
        case '+': r = a + b; break;
        case '-': r = a - b; break;
        case '*': r = a * b; break;
        case '/': r = b != 0 ? a / b : Double.NaN; break;
        default: System.out.println("Operação inválida"); sc.close(); return;
    }
    System.out.println("Resultado: " + r);
    System.out.println(r % 2 == 0 ? "Par" : "Ímpar");
    System.out.println(r >= 0 ? "Positivo" : "Negativo");
    System.out.println(r == Math.floor(r) ? "Inteiro" : "Decimal");
    sc.close();
}

}
