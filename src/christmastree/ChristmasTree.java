/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmastree;

import java.util.Scanner;

/**
 *
 * @author sooryagangarajk
 */
public class ChristmasTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        char sym = in.next().charAt(0);
        int n = 15;
        for (int k = 0; k < n; k++) {

            for (int i = 1; i <= (15 - k) / 2; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i <= k; i++) {
                if (k % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(sym);
                }
            }

            System.out.println();

        }
        //stem
        //width =15/5 height=15/3
        //
        // x+w+x=15
        // x=(15-w)
        int h = 15 / 3;
        for (int k = 0; k < h; k++) {
            int w = 15 / 5;
            for (int i = 1; i <= (15 - w) / 2; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= w; i++) {

                System.out.print(sym);

            }

            System.out.println();

        }
    }
    
}
