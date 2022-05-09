import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        System.out.println("Enter a new string");
        ArrayList list = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);

            String next = scanner.nextLine();
            list.add(next);
            if ((next.equals(""))) {
                System.out.println("The fifth item in the list is: " + list.get(4));
                break;
            }
        }
    }
}
