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
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nA = 0, nB = 0;
        int kA, mB;
        
        nA = sc.nextInt();
        nB = sc.nextInt();
        kA = sc.nextInt();
        mB = sc.nextInt();
        
        int[] arrA = new int[nA];
        int[] arrB = new int[nB]; 
        
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = sc.nextInt();
        }
        
        if (arrA[kA] < arrB[nB - mB]) 
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
