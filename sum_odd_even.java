import java.util.*;
class Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element:");
        int n = sc.nextInt();
        int sumOdd = 0;
        int sumEven = 0;
        System.out.println("enter the number :");
        for(int i = 0;i<n;i++){
            int num = sc.nextInt();
            if( num%2 == 0){
                sumEven+=num;
            }
            else{
               sumOdd+=num ;
            }
        }
        System.out.println("Number of elements:"+sumEven);
        System.out.println("Number of element"+sumOdd);
         
    }

        
}
