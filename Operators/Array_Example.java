import java.util.Scanner;
class Array_Example{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();	
		}
		System.out.println("Array elements : ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println(arr[0]);
		
		System.out.println("Using for each loop ");
		for(int i : arr){
			System.out.println("" +i);
		}
		
	}
}