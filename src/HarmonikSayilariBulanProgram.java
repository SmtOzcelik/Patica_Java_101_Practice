import java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir tam sayi giriniz : ");
        int sayi = input.nextInt();

        double toplam = 0;

        if (sayi > 0) {
            for (int i = 1; i <= sayi; i++) {
                toplam += Math.pow(i, -1);
            }
            System.out.println(toplam);
        }

        else {
            System.out.println("Gecerli bir deger girin.");
        }
    }
}
