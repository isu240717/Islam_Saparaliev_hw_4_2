import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            listA.add(input);
        }
        System.out.println("List A: " + listA);

        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            listB.add(input);
        }
        System.out.println("List B: " + listB);

        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }
        System.out.println("List C: " + listC);
        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        System.out.println("Sorted List C: " + listC);
    }
}
