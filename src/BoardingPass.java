import java.util.Scanner;

public class BoardingPass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int price = 100;
        int age = scanner.nextInt();
        if (age <= 12) {
            System.out.println("Price: " + price / .5);
        } else if (age >= 60)  {
            System.out.println("Price: " + price / .6);
        } else if (Gender == Female) {
            System.out.println("Price: " + price / .25);
        }


    }

}
