import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "codeforces";
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            int count = 0;
            String b = sc.next();
            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != b.charAt(i))
                    count++;

            }
            System.out.println(count);
        }

    }
}
