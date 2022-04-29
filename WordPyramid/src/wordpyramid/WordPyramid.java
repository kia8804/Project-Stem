/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordpyramid;

import java.util.Scanner;
/**
 *
 * @author guest123
 */
public class WordPyramid {

    
    public static void pyramid(String s)
    {
        if(s.length()<=1)
        {
            System.out.println(s);;
        }
        else
        {
            System.out.println(s);
            pyramid(s.substring(1, s.length()-1));
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        
        pyramid(s);
        
    }
    
}
