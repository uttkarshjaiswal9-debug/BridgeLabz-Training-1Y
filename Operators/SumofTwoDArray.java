import java.util.*;
public class SumOfTwoDArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter rows");
        int r = sc.nextInt();
        System.out.println("Enter coloumn");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter elements");
        for ( int i = 0 ; i < r ; i++){
            for ( int j = 0 ;  j < c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0 ; 
        for ( int i = 0 ; i < r ; i++){
            for ( int j = 0 ;  j < c ; j++){
                sum+= arr[i][j];
            }
        }
        System.out.println("The sum of the array is:" + sum );
    }
}