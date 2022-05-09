import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        System.out.println("Enter a new string");
        ArrayList list = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String next = scanner.nextLine();
            if ((next.equals(""))) {
                System.out.println("The last item in the list is: " + (list.get(list.size()-1)));
                break;
            }
            list.add(next);
        }
    }
}
