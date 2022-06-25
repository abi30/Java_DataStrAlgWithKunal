package day_2;

public class LeetCode14LongestCommonPrefix {

    public static void main(String[] args) {

        String[] s={"liower","fliow","flie","liowsir"};

        System.out.println(longestCommonPrefixMy(s));

        StringBuilder sr =new StringBuilder("wewrwe");
        sr.append("rakib");
        System.out.println(sr.toString());

    }

    public static String longestCommonPrefixMy(String[] strs){
        StringBuilder longestCommPrefix= new StringBuilder();

        if(strs==null||strs.length==0){
            longestCommPrefix.toString();
        }

        int minimunLength=strs[0].length();

        for (int i=1;i<strs.length;i++){
            minimunLength=Math.min(strs[i].length(),minimunLength);
        }
        for (int i=0;i<minimunLength;i++){

            char windowsChar=strs[0].charAt(i);
            for (String str:strs) {
                if(str.charAt(i)!=windowsChar){
                    return longestCommPrefix.toString();
                }
            }
            longestCommPrefix.append(windowsChar);

        }


        return longestCommPrefix.toString();
    }


    public static String longestCommonPrefix(String[] strs) {
        // Longest common prefix string
        StringBuilder longestCommonPrefix = new StringBuilder();
        // Base condition
        if (strs == null || strs.length == 0) {
            return longestCommonPrefix.toString();
        }
        // Find the minimum length string from the array
        int minimumLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength, strs[i].length());
        }
        // Loop for the minimum length
        for (int i = 0; i < minimumLength; i++) {
            // Get the current character from first string
            char current = strs[0].charAt(i);
            // Check if this character is found in all other strings or not
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }

    }
