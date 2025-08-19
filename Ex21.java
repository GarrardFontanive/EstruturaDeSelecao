import java.util.Scanner;

public class Ex21 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Data (dd/mm/aaaa): ");
    String s = sc.next();
    String[] parts = s.split("/");
    if (parts.length != 3) { System.out.println("Data inválida"); sc.close(); return; }
    int d = Integer.parseInt(parts[0]), m = Integer.parseInt(parts[1]), y = Integer.parseInt(parts[2]);
    boolean ok = true;
    if (m < 1 || m > 12) ok = false;
    else {
        int[] mdays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        boolean bis = (y%4==0 && y%100!=0) || (y%400==0);
        if (bis) mdays[2]=29;
        if (d < 1 || d > mdays[m]) ok = false;
    }
    System.out.println(ok ? "Data válida" : "Data inválida");
    sc.close();
}

}
