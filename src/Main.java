import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        double c, cevre, alan, u;
        System.out.print("a kenarını giriniz: ");
        a = sc.nextInt();

        System.out.print("b kenarını giriniz: ");
        b = sc.nextInt();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs uzunluğu : " + c);
    }

}
