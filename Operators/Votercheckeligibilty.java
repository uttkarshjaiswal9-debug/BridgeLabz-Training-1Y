import java.util.*;
class Votercheckeligibilty{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	if(age>=18){
		System.out.println("Eligible");
}else{
	System.out.println("Not Eligible");
}
}
}
