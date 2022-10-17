import java.util.Arrays;
import java.util.Scanner;

/*
 * © 2022 tienhuynh-tn
 * All rights reserved!
 * For more information, please contact via my email: tien.huynhlt.tn@gmail.com
 */

/**
 *
 * @author tienhuynh-tn
 */
public class VitalyAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        
        for (int i = s.length; i > 0; i--) {
            if (s[i - 1] == 'z') {
                s[i - 1] = 'a';
            } else {
                s[i - 1]++;
            }
            break;
        }
        
        if (Arrays.equals(s, t)) {
            System.out.println("No such string");
        } else {
            System.out.println(s);
        }
    }
}