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
public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= w; i++) {
            sum += i * k;
        }
        
        if (sum <= n) {
            System.out.println(0);
            return;
        }
        
        System.out.println(sum - n);
    }
}
