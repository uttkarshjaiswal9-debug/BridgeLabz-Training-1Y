public class Skip_Integer{
	public static void main (String[] args){
		for ( int i = 0 ; i < 5 ; i++){
			if ( i == 3){
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
}