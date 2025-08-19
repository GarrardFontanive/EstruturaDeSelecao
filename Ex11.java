import java.util.Scanner;

public class Ex11 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Turno (M/V/N): ");
    String t = sc.next().trim().toUpperCase();
    switch(t) {
        case "M": System.out.println("Bom Dia!"); break;
        case "V": System.out.println("Boa Tarde!"); break;
        case "N": System.out.println("Boa Noite!"); break;
        default: System.out.println("Turno inválido");
    }
    sc.close();
}

}
