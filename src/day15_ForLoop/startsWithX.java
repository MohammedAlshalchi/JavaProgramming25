package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {
/*
1. Write a program that asks user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();// because we will use the scanner ONE TIME

        if (word.charAt(0)=='x'){
            word=word.replaceFirst("x","a");
        }
        System.out.println(word);// No need to close the scanner BECAUSE we will use it one time










































    }










































}
