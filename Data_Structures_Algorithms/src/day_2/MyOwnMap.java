package day_2;

import java.util.HashMap;

public class MyOwnMap {
    public static void main(String[]args){

        HashMap<String,Integer>  empIds = new HashMap<>();

            empIds.put("rakib" ,2132);
            empIds.put("abi" ,1222);
            empIds.put("jerry" ,2132);

        System.out.println(empIds.get("abi"));
        System.out.println(empIds.containsValue(2132));

    }
}
