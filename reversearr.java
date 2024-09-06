import java.io.*;
import java.util.Scanner;

public class reversearr{
public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
System.out.println("enter the size of array:");
 int size = in.nextInt();

    int[] myarray = new int[size];

    System.out.println("enter the elements of array:");

    for(int i=0; i<myarray.length; i++){
        myarray[i] = in.nextInt();
    }


    System.out.print("reversed array:");
    for(int i=myarray.length-1; i>=0; i--){
        System.out.print(myarray[i]+ " ");
    }



}
}