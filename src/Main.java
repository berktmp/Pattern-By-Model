import java.util.Scanner;

public class Main {

    // Method for Design
    // Controls the entered number using a boolean flag
    // If num > 0, it is true.
    // Parameters: num (number to be controlled), control (flag), flag (counter)
    static int design(int num, boolean control, int flag) {
        if (control) {
            if (num > 0) {
                System.out.print(num + " ");
                flag++;
                return design(num - 5, true, flag);
            } else {
                return design(num, false, flag);
            }
        } else {
            System.out.print(num + " ");
            if (flag > 0) {
                flag--;
                return design(num + 5, false, flag);
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Creating Method According to Recursive Pattern");
        System.out.println("--------------------------------------");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("---------------------------------------");
        System.out.println(design(num, true, 0));
        System.out.println("---------------------------------------");
    }
}
