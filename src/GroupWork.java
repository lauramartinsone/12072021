import java.util.Scanner;

public class GroupWork {
    public static void main(String[] args) {

        short day;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day: ");
        day = scanner.nextShort();

        System.out.println("The dat is: " + day);

        if (day < 0) {
            System.out.println("Day can't be negative");
        } else if (day > 365) {
            System.out.println("Can't be that large");
        } else {
            short month = (short) (Math.ceil(day / 30) + 1);
            switch (month) {
                case 1:

                    System.out.println("It is January");
                    break;
                case 2:

                    System.out.println("It is February");


            }


        }
    }
}