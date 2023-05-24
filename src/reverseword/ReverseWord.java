/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseword;
import java.util.Scanner;

/**
 *
 * @author SP
 */
public class ReverseWord 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //System.out.println("Mehak");
        //Step1: take input from user
        Scanner input = new Scanner(System.in);
        String word = input.next();
        //Step2: split char from word and store in char{}
        char[] reverse = new char[word.length()]; 
        for(int i=0;i<word.length();i++)
        {
            reverse[i]=word.charAt(i);//h
        }
        //Step3: read array reverse print it
        for(int i=reverse.length-1;i>=0;i--)
        {
            System.out.println(reverse[i]);
        }
        
    }
    
}
