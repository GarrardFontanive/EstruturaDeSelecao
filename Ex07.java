import java.util.Scanner;

public class Ex07 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite três números separados por espaço: ");
    double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
    double[] arr = {a,b,c};
    java.util.Arrays.sort(arr);
    System.out.println("Ordem decrescente: " + arr[2] + ", " + arr[1] + ", " + arr[0]);
    sc.close();
}

}
