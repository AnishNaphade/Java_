import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class minmaxarray {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        System.out.println("The maxvalue is:"+maxval(arr));
        System.out.println("The minvalue is:"+minval(arr));
    }
    


        static int maxval(int[] arr){
            int maxval = arr[0];

            for(int i =1;i<arr.length;i++){
                if (maxval<arr[i]) {
                     maxval=arr[i] ;

                }
            }
            return maxval;

        }

       static int minval(int[] arr){
        int minval = arr[0];

        for(int i = 1; i<arr.length;i++){
            if (arr[i]<minval) {
                minval = arr[i];
                
            }
        }
        return minval;
       }

        

    
    
}
