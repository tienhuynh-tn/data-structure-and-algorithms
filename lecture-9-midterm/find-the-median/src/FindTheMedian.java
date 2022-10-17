import java.util.ArrayList;
import java.util.Collections;
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
public class FindTheMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            ar.add(sc.nextInt());
        }
        
        Collections.sort(ar);
        System.out.println(ar.get(((0 + ar.size() - 1) / 2)));
    }
}