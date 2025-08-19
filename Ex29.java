import java.util.Scanner;

public class Ex29 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] q = {"Telefonou para a vítima?","Esteve no local do crime?","Mora perto da vítima?","Devia para a vítima?","Já trabalhou com a vítima?"};
    int sim=0;
    for (int i=0;i<5;i++){
        System.out.println(q[i]+" (s/n)");
        String r = sc.next().trim().toLowerCase();
        if (r.equals("s")) sim++;
    }
    if (sim == 5) System.out.println("Assassino");
    else if (sim >= 3) System.out.println("Cúmplice");
    else if (sim == 2) System.out.println("Suspeita");
    else System.out.println("Inocente");
    sc.close();
}

}
