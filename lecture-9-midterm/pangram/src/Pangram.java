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
public class Pangram {
    public static void main(String[] args) {
        //char[] alphabet = "abcdefghijklmnopqrstuvwsynz".toCharArray();
        int[] count = new int[26];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ar = sc.next();
        char[] arr = ar.toCharArray();
        for (int i = 0; i < arr.length; i++) {
           count[(int)Character.toLowerCase(arr[i]) - 97]++;
        }
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}