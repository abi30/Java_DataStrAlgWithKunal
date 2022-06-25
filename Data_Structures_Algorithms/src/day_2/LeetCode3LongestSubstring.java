package day_2;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;

public class LeetCode3LongestSubstring {
    public static void main(String[]args){


        String s="abcabcsbb";
        System.out.println(lengthOfLongestSubstring_1(s));


    }

//    public static int lengthOfLongestSubstring(String s){
//        HashMap<Character,Integer> indexCountMap=new HashMap<Character,Integer> ();
//      int startIndex=0;
//      int maxIndexCount=0;
//      int tempIndexCount=0;
//
//    //      0 1 2 3 4 5 6 7
//    //     "a b c a b c d d"
//        for (int i = 0; i < s.length(); i++) {
//
//            if (indexCountMap.containsKey(s.charAt(i))) {
//                if(indexCountMap.get(s.charAt(i))>=startIndex){
//
//
//                    int temp=startIndex;
//                    startIndex=indexCountMap.get(s.charAt(i))+1;
//
//                    int diff= startIndex-temp;
//                    tempIndexCount=tempIndexCount-diff;
//
//                }
//                tempIndexCount++;
//
//                indexCountMap.put(s.charAt(i),i);
//
//            }else{
//                tempIndexCount++;
//                indexCountMap.put(s.charAt(i),i);
//            }
//
//            if(maxIndexCount<tempIndexCount){
//
//                maxIndexCount=tempIndexCount;
//            }
//
//
//        }
//
//        return maxIndexCount;
//    }

    public static  int lengthOfLongestSubstring_1(String s){
        int a_point=0;
        int b_point= 0;
        int max=0;
        HashSet<Character> hashSet= new HashSet<>();
          //      0 1 2 3 4 5 6 7
          //     "a b c a b c d d"

        while (b_point<s.length()){
            // in the start hashSet is ampty.....
            // check hashset contains s(0)=="a" in the hasSet
            if(hashSet.contains(s.charAt(b_point))){  // if true
                hashSet.remove(s.charAt(a_point)); // then remove this char from hashSet
                a_point++;// start check again from next index as mentioned  a_point
            }else {// if false
                hashSet.add(s.charAt(b_point));//then add this char in the hashSet
                max=Math.max(hashSet.size(),max);// increase the max value depend on hasSet.size()
                b_point++;//and going to start check again for this purpose b_point is increasing

            }

        }
        return  max;
    }


}



