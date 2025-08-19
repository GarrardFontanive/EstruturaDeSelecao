import java.util.Scanner;

public class Ex19 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("a: ");
    double a = sc.nextDouble();
    if (a == 0) { System.out.println("Não é equação do 2º grau"); sc.close(); return; }
    System.out.print("b: ");
    double b = sc.nextDouble();
    System.out.print("c: ");
    double c = sc.nextDouble();
    double delta = b*b - 4*a*c;
    if (delta < 0) System.out.println("Não há raízes reais");
    else if (delta == 0) { double r = -b/(2*a); System.out.println("Raiz única: " + r); }
    else {
        double r1 = (-b + Math.sqrt(delta)) / (2*a);
        double r2 = (-b - Math.sqrt(delta)) / (2*a);
        System.out.println("Duas raízes: " + r1 + " e " + r2);
    }
    sc.close();
}

}
