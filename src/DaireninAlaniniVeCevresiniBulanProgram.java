import java.util.Scanner;


class DaireninAlaniniVeCevresiniBulanProgram {

    public static void main(String[] args) {

        int r, a;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin yarı çapını giriniz : ");
        r = input.nextInt();
        System.out.println("Üçgenin alanı = " + pi * r * r);
        System.out.println("Üçgenin çevresi = " + pi * r * 2);
    }
}
