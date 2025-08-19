import java.util.Scanner;

public class Ex13 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Valor da hora: ");
    double vh = sc.nextDouble();
    System.out.print("Horas trabalhadas: ");
    double h = sc.nextDouble();
    double bruto = vh * h;
    double inss = bruto * 0.10;
    double ir;
    if (bruto <= 900) ir = 0;
    else if (bruto <= 1500) ir = bruto * 0.05;
    else if (bruto <= 2500) ir = bruto * 0.10;
    else ir = bruto * 0.20;
    double fgts = bruto * 0.11;
    double sindicato = bruto * 0.03;
    double descontos = ir + sindicato + inss;
    double liquido = bruto - (ir + inss + sindicato);
    System.out.printf("Salário Bruto: R$ %.2f\n(-) IR: R$ %.2f\n(-) INSS: R$ %.2f\nFGTS: R$ %.2f\nTotal descontos: R$ %.2f\nSalário Líquido: R$ %.2f\n", bruto, ir, inss, fgts, descontos, liquido);
    sc.close();
}

}
