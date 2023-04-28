import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {

    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava sicakligini giriniz : ");

        heat = input.nextInt();

        if (heat >= 25){
            System.out.println("Yüzmeye gidebilirsin");
        }else if(heat >= 10){
            System.out.println("Piknige gidebilirsin");
        }else if(heat>=5){
            System.out.println("Sinemaya gidebilirsin");
        }else if(heat>=0){
            System.out.println("Kayak Yapabilirsin");
        }

    }
}
