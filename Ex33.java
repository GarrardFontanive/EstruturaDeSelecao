import java.util.Scanner;

public class Ex33 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] gabarito = {'a','a','b','b','c','c','d','d','e','e'};
    int pontos = 0;
    for (int i=0;i<10;i++){
        System.out.print("Resposta Q"+(i+1)+": ");
        char r = sc.next().toLowerCase().charAt(0);
        System.out.print("Q"+(i+1)+" : " + r);
        if (r == gabarito[i]) { System.out.println(" : Correto"); pontos++; }
        else System.out.println(" : Errada, resposta correta ("+gabarito[i]+")");
    }
    System.out.println("Pontuação Final: " + pontos);
    sc.close();
}

}
