import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tag = scanner.nextLine();
        char[] characters = tag.toCharArray();

        char c = characters[2];
        char h = characters[6];

        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
            System.out.println("invalid");
            return;
        } else if (h != '-') {
            System.out.println("invalid");
            return;
        }

        if ((characters[0] + characters[1]) % 2 != 0) {
            System.out.println("invalid");
            return;
        } else if ((characters[3] + characters[4]) % 2 != 0) {
            System.out.println("invalid");
            return;
        } else if ((characters[4] + characters[5]) % 2 != 0) {
            System.out.println("invalid");
            return;
        } else if ((characters[7] + characters[8]) % 2 != 0) {
            System.out.println("invalid");
            return;
        }

        System.out.println("valid");
    }
}
