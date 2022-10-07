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
public class BearAndGame {

    public static int countMinutesWatch(ArrayList<Integer> list) {
        int hour = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (hour + 15 < list.get(i)) {
                return hour + 15;
            } else {
                hour = list.get(i);
            }
            
            if (i == list.size() - 1) {
                hour = Math.min(hour + 15, 90);
            }
        }
        
        return hour;
    }
    
    public static void main(String[] args) {
        int n = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int hour = sc.nextInt();
            list.add(hour);
        }
        
        System.out.println(countMinutesWatch(list));
    }
}