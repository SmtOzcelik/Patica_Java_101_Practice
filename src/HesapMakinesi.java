import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        int sayi1, sayi2, sonuc;
        short islem;
        Scanner girdi = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz : ");
        sayi1 = girdi.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        sayi2 = girdi.nextInt();
        System.out.println("İşlem Seçiniz (1=+,2=-,3=/,4=*) :");
        islem = girdi.nextShort();


        switch (islem) {

            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Toplama işleminin sonucu : " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Çıkartma İşleminin Sonucu : " + sonuc);
                break;
            case 3:
                sonuc = sayi1 / sayi2;
                System.out.println("Bölme İşleminin Sonucu : " + sonuc);
                break;
            case 4:
                sonuc = sayi1 * sayi2;
                System.out.println("Çarpma İşleminin Sonucu : " + sonuc);
                break;
            default:
                System.out.println("1,2,3,4 Dışında değer girdiniz.");
                break;
        }
    }
}
