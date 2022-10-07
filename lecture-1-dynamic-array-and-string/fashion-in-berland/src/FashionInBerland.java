/*
 * © 2022 tienhuynh-tn
 * All rights reserved!
 * For more information, please contact via my email: tien.huynhlt.tn@gmail.com
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tienhuynh-tn
 */
public class FashionInBerland {

    public static void main(String[] args) {
        int n;
        ArrayList<Integer> list = new ArrayList<>();
        int button;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            button = sc.nextInt();
            list.add(button);
        }

        boolean result = checkJacketButton(n, list);

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean checkJacketButton(int n, ArrayList<Integer> list) {
        if (n == 1) {
            if (list.get(0) == 1) {
                return true;
            } else {
              	return false;
            }
        }

        int count = 0;
        if (n > 1) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 0) {
                    count++;
                }
            }

            if (count == 1) {
                return true;
            } else {
                return false;
            }
        }
        
        return true;
    }
}