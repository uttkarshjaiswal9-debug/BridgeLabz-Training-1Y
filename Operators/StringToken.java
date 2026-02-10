public class StringToken{
    int addition ( int a , int b ){
        return a + b ; 
    }
    public static void main(String[] args) {
        StringToken t1 = new StringToken();
        int result = t1.addition(10, 20);
        System.out.println(result);
    }
}