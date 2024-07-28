package LoopsSwitch;

import java.util.Scanner;

public class Q43Alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        char alpha = sc.next().charAt(0);

        switch (alpha) {
            case 'a': {
                System.out.println("Vowel");
                break;
            }
            case 'e':{
                System.out.println("Vowel");
                break;
            }
            case 'i': {
                System.out.println("Vowel");
                break;
            }
            case 'o':{
                System.out.println("Vowel");
                break;
            }
            case 'u':{
                System.out.println("Vowel");
                break;
            }
            default:
                System.out.println("Consonant");
                break;
        }
    }
}
