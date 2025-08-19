import java.util.Scanner;

public class Ex15 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Preço de custo: R$ ");
    double p = sc.nextDouble();
    System.out.print("Código de origem: ");
    int c = sc.nextInt();
    String proc;
    switch(c) {
        case 1: proc = "Sul"; break;
        case 2: proc = "Norte"; break;
        case 3: proc = "Leste"; break;
        case 4: proc = "Oeste"; break;
        case 5: case 6: proc = "Nordeste"; break;
        case 7: case 8: proc = "Centro-oeste"; break;
        default: proc = "Importado"; break;
    }
    System.out.println("Preço: R$ " + p + " | Procedência: " + proc);
    sc.close();
}

}
