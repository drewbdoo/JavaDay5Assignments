import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {

        System.out.println("Enter some integers");
        ArrayList list = new ArrayList<>();
            for (int i = 0; i < list.size() + 1; i++) {
            Scanner scanner = new Scanner(System.in);
            int next = scanner.nextInt();
            if ((next == 0)) {
                for (int u = 0; u < list.size(); u++) {
                    if (u - (list.size() - 1) != 0) {
                        System.out.print(list.get(u) + ", ");
                    } else {
                        System.out.print("and " + list.get(u) + " were the items in the list. ");
                    }
                }
            }

            list.add(next);

            }

            add(list);

        }

        public static void add (ArrayList<Integer>list) {
            int sum = 0;
        for (int z = 0; z < list.size(); z++) {
             sum += (int) list.get(z);
            System.out.println("The sum of all these is: " + sum);

        }


        }
    }


