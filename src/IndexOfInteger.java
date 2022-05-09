import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        System.out.println("Enter a new integer");
        ArrayList list = new ArrayList<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int next = scanner.nextInt();
            if ((next == 0)) {
                System.out.println("Done entering integers into the list");
                System.out.println("What number are you looking for in the list?");
                int response = scanner.nextInt();
                for (int i = 0; i < list.size(); i++) {
                    if(list.get(i).equals(response)) {
                        System.out.println(response + " is at index " + i);
                    }
                }
                break;
            }
            list.add(next);
        }

    }
}
