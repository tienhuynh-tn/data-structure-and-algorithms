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
public class Passwords {
    public static void main(String[] args) {
        int n = 0;
        int k;
        int bestTime = 0, worstTime = 0;
        int[] countPasswordLenght = new int[101];
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
            countPasswordLenght[list.get(i).length()]++;
        }
        
        String password = sc.next();
        
        for (int i = 0; i < password.length(); i++) {
            bestTime += countPasswordLenght[i];
        }
        
        worstTime = bestTime + countPasswordLenght[password.length()] - 1;
        
        bestTime += (bestTime / k) * 5;
        worstTime += (worstTime / k) * 5;
        
        System.out.println((bestTime + 1) + " " + (worstTime + 1));
    } 
}