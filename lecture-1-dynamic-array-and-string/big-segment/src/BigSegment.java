import java.util.ArrayList;
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
public class BigSegment {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int left = (int)1e9 + 5, right = 0;
        
        n = sc.nextInt();
        
        ArrayList<Integer> listLeft = new ArrayList<>();
        ArrayList<Integer> listRight = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listLeft.add(sc.nextInt());
            listRight.add(sc.nextInt());
            left = Math.min(left, listLeft.get(i));
            right = Math.max(right, listRight.get(i));
        }
        
        for (int i = 0; i < n; i++) {
            if (left == listLeft.get(i) && right == listRight.get(i)) {
                System.out.println(i + 1);
                return;
            }
        }
        
        System.out.println(-1);
    }
}