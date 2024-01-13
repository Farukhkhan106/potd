import java.util.*;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ori = "abc";
        int count = 0;
        String dup = sc.next();
        for (int i = 0; i < 3; i++) {
            // System.out.println(ori.charAt(i));
            if ((ori.charAt(i)) == (dup.charAt(i))) {

            } else {
                count++;
            }
        }
        System.out.println(count);
        if (count == 2 || count == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
