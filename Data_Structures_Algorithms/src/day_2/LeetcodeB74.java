package day_2;

public class LeetcodeB74 {

    public static void main(String[] args) {

        int[][] arr={{1},{3}};
        int target=0;

        boolean ans=searchMatrix(arr,target);
        System.out.println(ans);

    }


        public static boolean searchMatrix(int[][] matrix, int target) {

            if (matrix.length==1){
                int row=0;
                int s=0;
                int e=matrix[row].length-1;

                while (s<=e){

                    int mid=s+(e-s)/2;

                    if(matrix[row][mid]==target) {

                        return true;
                    }
                    if(matrix[row][mid]<target) {
                        s=mid+1;
                    }else {
                        e=mid-1;;
                    }

                }
                return false;
            }

            else{



                int row=0;
                int col=matrix[row].length-1;

                while(row<matrix.length && col>=0) {

                    if(matrix[row][col]==target) {
                        return true;
                    }
                    if(matrix[row][col]<target) {
                        row++;
                    }else {

                        col--;
                    }


                }

                return false;

            }

        }


    }


