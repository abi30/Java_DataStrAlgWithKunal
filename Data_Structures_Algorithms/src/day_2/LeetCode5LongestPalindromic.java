package day_2;

public class LeetCode5LongestPalindromic {

    public static void main(String [] args){

        System.out.println("racecar");
        longgestPalindrome("racecar");
    }

public  static void longgestPalindrome(String s){


    for (int i = 0; i <s.length() ; i++) {
        for (int j = 0; j < s.length(); j++) {
            for (int k = 0; k < s.length(); k++) {
                System.out.println(s.charAt(i));
                System.out.println(s.charAt(j));
                System.out.println(s.charAt(k));


            }

        }
    }
}



}
