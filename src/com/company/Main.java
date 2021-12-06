package com.company;

import java.util.Scanner;


public class Main {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int count = 0;
        int size = a.length();
        String c = "";
        String d = "";
        char temp = ' ';


        if (a.length() != b.length()) {
            return false;
        } else if (a.compareTo(b) == 0) {
            return true;
        } else {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < a.length() - 1; j++) {
                    if (a.charAt(j) > a.charAt(j + 1)) {
                        temp = a.charAt(j);
                        a = a.substring(0, j) + a.charAt(j + 1) + a.charAt(j) + a.substring(j + 2);
                    }
                    if (b.charAt(j) > b.charAt(j + 1)) {
                        temp = b.charAt(j);
                        b = b.substring(0, j) + b.charAt(j + 1) + b.charAt(j) + b.substring(j + 2);
                    }
                }
            }


//
        }


        if (a.compareTo(b) == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
