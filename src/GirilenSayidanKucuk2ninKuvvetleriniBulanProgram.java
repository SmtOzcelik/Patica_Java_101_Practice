import java.util.Scanner;

public class GirilenSayidanKucuk2ninKuvvetleriniBulanProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Lutfen pozitif bir tam sayi giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i *= 4) {

            System.out.print(i + ", ");
        }
        System.out.println();

        for (int j = 1; j <= sayi; j *= 5) {

            System.out.print(j + ", ");
        }

    }
}
