import java.util.Scanner;

public class GirilenSayiyaKadarOlanCiftSayilariBulanProgram {

    public static void main(String[] args) {
        int k, piece = 0, total = 0;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz : ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                piece++;

            }
        }
        average = total / (piece - 1);
        System.out.println(average);

    }
}
