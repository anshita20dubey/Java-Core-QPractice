package Strings;

import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-97]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > 0) System.out.println((char) (i+97) + " -> "+freq[i]);
        }
    }
}