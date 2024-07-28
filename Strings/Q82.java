package Strings;

import java.util.Scanner;

public class Q82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int[] counts1 = new int[26];
        for(char ch : s1.toCharArray()){
            counts1[ch-97]++;
        }
        String s2 = sc.nextLine();
        int[] counts2 = new int[26];
        for(char ch : s2.toCharArray()){
            counts2[ch-97]++;
        }
        int check = -1;
        if(s1.length() == s2.length()){
            for (int i = 0; i < counts1.length; i++) {
                if(counts1[i] != counts2[i]){
                    check = 2;
                    break;
                }
            }
        }
        else{
            check=2;
        }
        System.out.println(check == -1 ? "Anagram" : "Not anagram");
    }
}
