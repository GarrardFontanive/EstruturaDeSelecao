import java.util.Scanner;

public class Ex32 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Tipos: 1-File Duplo, 2-Alcatra, 3-Picanha");
    System.out.print("Tipo: "); int tipo = sc.nextInt();
    System.out.print("Quantidade (Kg): "); double kg = sc.nextDouble();
    System.out.print("Pagamento no cartão Tabajara? (s/n): "); String cart = sc.next().trim().toLowerCase();
    double price = 0; String nome = "";
    if (tipo==1){ nome="File Duplo"; price = kg <=5 ? 4.90 : 5.80; }
    else if (tipo==2){ nome="Alcatra"; price = kg <=5 ? 5.90 : 6.80; }
    else if (tipo==3){ nome="Picanha"; price = kg <=5 ? 6.90 : 7.80; }
    double total = price * kg;
    double desc = (cart.equals("s")) ? total * 0.05 : 0;
    double pagar = total - desc;
    System.out.printf("Cupom\nTipo: %s\nKg: %.2f\nPreço total: R$ %.2f\nDesconto: R$ %.2f\nValor a pagar: R$ %.2f\n", nome, kg, total, desc, pagar);
    sc.close();
}

}
