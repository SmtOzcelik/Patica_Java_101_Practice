import java.util.Scanner;

public class ArmstrongSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir Değer Giriniz: ");
        int basamak,basamakTop=0;

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int num = scan.nextInt();

        while (num!=0){

            basamak=num%10;
            basamakTop+=basamak;
            num/=10;}
        System.out.println(basamakTop);

    }
}
