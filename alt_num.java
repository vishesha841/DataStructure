import java.util.*;
class Altnum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element:");
        int n = sc.nextInt();
       int arr[] = new int[n];
        System.out.println("enter the number :");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
           
            }
        
        
       System.out.println("Alternative numbers:");
       for(int i=0;i<n;i+=2){
       System.out.println(arr[i] + " ");
       }
       sc.close();
         
    }

        
}
