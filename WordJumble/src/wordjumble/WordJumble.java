package wordjumble;

import java.util.Scanner;

public class WordJumble {

    public static void permutations(String s, int n, int l)
    {
        if(l == n)
        {
            System.out.println(s);
        }
        else
        {
            for(int i = l; i < n; i++)
            {
                char[] arr = s.toCharArray();
                
                char temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
                
                s = String.valueOf(arr);
                
                permutations(s, n, l+1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a word: ");
        String s = scan.nextLine();
        int n = s.length();
        
        permutations(s, n, 0);
    }
    
}
