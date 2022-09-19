package All189Creaking;

public class IsUnique001 {

    public static void main(String[]args){


        String string1 = "#121";
        String string2 = "vfr412#";
        String string3 = "#V2A53";

        boolean x = isUnique(string3);
        System.out.println(x);

    }

    static boolean isUnique(String str){

        if(str.length()>128){
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {

            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;

        }

        return true;
    }


}
