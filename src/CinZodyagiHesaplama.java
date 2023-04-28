import java.util.Scanner;


public class CinZodyagiHesaplama {

    public static void main(String[] args) {


        Scanner scn =new Scanner(System.in);
        System.out.print("Enter your year of birth : ");


        int  birthYear = scn.nextInt();
        int remainder = birthYear%12 ;
        System.out.print("Your Chinese zodiac is : ");

        switch (remainder){

            case 0 :
                System.out.println("Monkey");
                break;
            case 1 :
                System.out.println("cockerel");

            case 2 :
                System.out.println("dog");
                break;
            case 3 :
                System.out.println("Pig");
                break;
            case 4 :
                System.out.println("mouse");
                break;
            case 5 :
                System.out.println("bullock");
                break;
            case 6 :
                System.out.println("Tiger");
                break;
            case 7 :
                System.out.println("Rabit");
                break;
            case 8 :
                System.out.println("Dragon");
                break;
            case 9 :
                System.out.println("Snake");
                break;
            case 10 :
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
        }
    }
}
