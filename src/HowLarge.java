import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        System.out.println("Enter a new string");
        ArrayList list = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String next = scanner.nextLine();
            if ((next.equals(""))) {
                System.out.println("The total amount of items in the list was: " + list.size());
                break;
            }
            list.add(next);

        }

    }
}
