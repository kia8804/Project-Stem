package towerofhanoi;

import java.util.Scanner;

public class TowerOfHanoi {
    
    public static int c = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        String toPeg, fromPeg, tempPeg;

        fromPeg = "A";
        toPeg = "C";
        tempPeg = "B";
        //begin Towers of Hanoi with 4 disks
        System.out.println("Towers of Hanoi problem");
        System.out.print("Enter number of disks: ");
        n = scan.nextInt();
        System.out.println("There are " + n + " discs on peg " +
          fromPeg + " initially");
        //Execute hanoi method to solve the problem
        hanoi(fromPeg, toPeg, tempPeg, n);
        System.out.println("Moves: " + c);
    }

    public static void hanoi(String fr,String to,String tp,int n){
        if (n == 1) {
          System.out.println("Move disc 1 from "+fr+" to "+to);
        } else {
          hanoi(fr, tp, to, n - 1);
          System.out.println("Move disc "+n+" from "+fr+" to "+to);
          hanoi(tp, to, fr, n - 1);
        }
        c++;
    }
    
}
