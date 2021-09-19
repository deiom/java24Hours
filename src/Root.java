import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        // Just an app returning the square root of an inputted by user integer
        System.out.println("Please input positive integer.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("The square root of "
        +number
        +" is "
        +Math.sqrt(number)
        );
    }
}
