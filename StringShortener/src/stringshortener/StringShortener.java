/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringshortener;
import java.util.Scanner;

/**
 *
 * @author Kiarash
 */
public class StringShortener {

    public static void algorithm1(String s)
    {
        int v = 0, r = 0;
        String newS = "";
        newS+=s.charAt(0);
        
        for(int i = 1; i < s.length(); i++){
          if((s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') && (s.charAt(i-1) != ' ')) v++;
          else newS+=s.charAt(i);
        }

        for(int i = 0; i < newS.length()-1; i++)
        {
            if(newS.charAt(i) != ' ' && newS.charAt(i) == newS.charAt(i+1))
            {
                r++;
                newS = newS.substring(0, i) + newS.substring(i+1);
            }
        }

        System.out.println("\nAlgorithm 1");
        System.out.println("Vowels removed: " + v);
        System.out.println("Repeats removed: " + r);
        System.out.println("Algorithm 1 message: " + newS);
        System.out.println("Algorithm 1 characters saved: " + (v+r));
    }
    
    public static void algorithm2(String s)
    {
        boolean valid;
        int c = 0;
        int arr[] = new int[125];
        String msg = "";

        for(int i = 0; i < s.length(); i++)
        {
          valid = true;
           for(int j = 0; j < s.length(); j++)
           {
             if(s.charAt(i)!= ' ' && s.charAt(i) == s.charAt(j))valid = false;
           }
           if(!valid)arr[s.charAt(i)]++;
        }

        for(int i = 97; i <= 122; i++)
        {
          if(arr[i] != 0) c++;
        }

        for(int i = 0; i < s.length(); i++)
        {
          if(arr[s.charAt(i)] != 0){
            msg+=Integer.toString(arr[s.charAt(i)]);
            msg+=s.charAt(i);
            arr[s.charAt(i)] = 0;
          }
        }
        
        System.out.println("\nAlgorithm 2");
        System.out.println("Unique characters found: " + c);
        System.out.println("Algorithm 2 message: " + msg);
        System.out.println("Algorithm 2 characters saved: " + (s.length()-msg.length()));
    }
    
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s;

        System.out.println("Type the message to be shortened");
        s = scan.nextLine().toLowerCase();

        algorithm1(s);
        algorithm2(s); 

    }
}