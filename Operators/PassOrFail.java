import java.util.*;
public class PassOrFail{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        if ( marks >= 90 ){
            System.out.println("Your Grade is 'A' ");
        }
        else if ( marks < 90 && marks >= 70 ){
            System.out.println("Your Grade is 'B' ");
        }
        else if ( marks < 70  && marks >= 60 ){
            System.out.println("Your Grade is 'C' ");
        }
        else {
            System.out.println("You failed");
        }
    }
}