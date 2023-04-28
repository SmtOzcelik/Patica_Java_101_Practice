import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,r,nrfaktoriyel = 1,nfaktoriyel = 1, rfaktoriyel=1;
        int total;
        System.out.println("Bir Sayı Giriniz: ");
        n = input.nextInt();
        System.out.println("İkinci bir sayı giriniz: ");
        r = input.nextInt();
        int nr= n-r;
        // N Faktöriyeli hesaplatalım

        for(int i=1;i<=n;i++){
            nfaktoriyel*=i;

        }
        // R Faktöriyeli hesaplatalım

        for(int i=1;i<=r;i++){
            rfaktoriyel*=i;

        }

        // N-R Faktöriyeli hesaplatalım

        for(int i=1;i<=nr;i++){
            nrfaktoriyel*=i;

        }
        total = nfaktoriyel/(rfaktoriyel*nrfaktoriyel);

        System.out.println("N faktoriyel Sonuc:  " + nfaktoriyel);
        System.out.println("R faktoriyel Sonuc:  " + rfaktoriyel);
        System.out.println("N-r Faktoriyel Sonuc:    " + nrfaktoriyel);
        System.out.println("İşlemin Sonucu:     "+ total);
    }
}
