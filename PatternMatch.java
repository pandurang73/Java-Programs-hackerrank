import java.util.regex.*;
import java.util.*;

public class PatternMatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String patt = sc.nextLine();

            try {
                Pattern.compile(patt);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

        }
    }
}