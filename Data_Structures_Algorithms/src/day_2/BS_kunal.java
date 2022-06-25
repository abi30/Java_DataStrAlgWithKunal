package day_2;

public class BS_kunal {

    public static void main(String[]args){

        int[]array= {3,56,132,159,431,501};
        int target= 501;
        int ans=search(array,target,0,array.length-1);
        System.out.println(ans);

    }
    static int search(int [] array, int target,int s, int e){


        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(array[m] == target){
            return m;
        }
        if(array[m]<target){
            return search(array,target,m+1,e);
        }else{
           return search(array,target,s,m-1);
        }

    }
}
