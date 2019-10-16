/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ReverseString {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String reverse = "";
       String userInput; 
       
       
       System.out.println("Please enter String word: "); //prompts user to input a string
       userInput = sc.nextLine(); // prints inputed string on the next line
       
       
       for (int i = userInput.length() - 1; i >= 0; i--)//formulla that will prompt the program to reverse the string decrmenting which outputs the word in reverse order 
       {
           reverse = reverse + userInput.charAt(i);
       
       }
       System.out.println(reverse);
       //print reversed string
    }
    
}
