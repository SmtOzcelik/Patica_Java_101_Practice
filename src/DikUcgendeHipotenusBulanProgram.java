import java.util.Scanner;


public class DikUcgendeHipotenusBulanProgram {

    public static void main(String[] args) {

        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("A kenar uzunluklarını giriniz : ");
        a = input.nextInt();
        System.out.print("B kenar uzunluklarını giriniz : ");
        b = input.nextInt();
        double c = Math.sqrt((a * a) + (b * b));
        double u = (a + b + c) / 2;
        System.out.println("C (Hipotenüs) uzunlugu = " + c);
        System.out.println("Üçgenin çevresi = " + u * 2);

    }
}
