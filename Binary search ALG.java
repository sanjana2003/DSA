/*Binary searching algorithm
Write a program to implement Binary searching algorithm for searching an element in an array.
Input Format:

The first line corresponds to size of an array.

The second line corresponds to the elements in the array.

The third input corresponds to element to be searched.

Output Format:

If the searching element present in the array print the number along with the location Eg:" 10 is found at location 6".

otherwise print "Not found".

Sample Input:

6

11 15 26 38 9 10

10 

Sample Output:

10 is present at location 6.*/


import java.util.Arrays;
import java.util.Scanner;

public class Main{
   
    static int  binary_search(int arr[],int tar,int b,int e){
        if(b<e){
            int mid = b+(e-b)/2;
            if(arr[mid]==tar)
                return mid;
            if(arr[mid]<tar)
                return binary_search(arr,tar,mid+1,e);
            return binary_search(arr,tar,b,mid-1);
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sa = new Scanner(System.in);
        int a = sa.nextInt();
        int arr[] = new int[a];
       
        for(int i=0;i<a;i++){
            arr[i]=sa.nextInt();
        }
        int tar = sa.nextInt();
        int index = binary_search(arr,tar,0,arr.length-1);
      int sat = index+1;
 
      if(index== -1)
        System.out.println("Not found");
      else
        System.out.println(tar +" found at location "+ sat+".");
     
    }
}
