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
public class NightAtTheMuseum {

    public static int calculateNumberRotation(String input) {
        char begin = 'a';
        int count = 0;
        int distance = 0;
        
        for (int i = 0; i < input.length(); i++) {
            distance = input.charAt(i) - begin;
            distance = Math.abs(distance);
            if (distance <= 13) {
                count += distance;
            } else {
                count += 26 - distance;
            }
            begin = input.charAt(i);
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        System.out.println(calculateNumberRotation(input));
    }
}
